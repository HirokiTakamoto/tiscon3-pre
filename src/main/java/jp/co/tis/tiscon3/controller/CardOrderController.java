package jp.co.tis.tiscon3.controller;

import enkan.collection.Multimap;
import enkan.component.BeansConverter;
import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import jp.co.tis.tiscon3.dao.CardOrderDao;
import jp.co.tis.tiscon3.entity.CardOrder;
import jp.co.tis.tiscon3.form.CardOrderForm;
import kotowari.component.TemplateEngine;
import org.seasar.doma.jdbc.SqlExecutionException;

import javax.inject.Inject;
import javax.transaction.Transactional;

import static enkan.util.HttpResponseUtils.RedirectStatusCode.SEE_OTHER;
import static kotowari.routing.UrlRewriter.redirect;

/**
 * @author hirano
 */
public class CardOrderController {

    @Inject
    private TemplateEngine templateEngine;

    @Inject
    private DomaProvider daoProvider;

    @Inject
    private BeansConverter beans;

    public HttpResponse userForm() {
        return templateEngine.render("cardOrder/new", "form", new CardOrderForm());
    }

    public HttpResponse jobForm(CardOrderForm form) {
        form.setErrors(null);
        return  templateEngine.render("cardOrder/job","form", form);
    }

    public  HttpResponse modifyUser(CardOrderForm form) {
        form.setErrors(null);
        return templateEngine.render("cardOrder/new", "form", form);
    }

    @Transactional
    public HttpResponse create(CardOrderForm form) {
        if (form.hasErrors()) {
            return templateEngine.render("cardOrder/new", "form", form);
        }
        CardOrderDao cardOrderDao = daoProvider.getDao(CardOrderDao.class);
        CardOrder cardOrder = beans.createFrom(form, CardOrder.class);
        try {
            cardOrderDao.insert(cardOrder);
        } catch (SqlExecutionException e) {
            Multimap<String, Object> errors = form.getErrors();
            errors.put("global", "ご入力内容に不備があります。内容を訂正して、再度お申し込みへお進みください。");
            form.setErrors(errors);
            return templateEngine.render("cardOrder/new","form", form);
        }

        return redirect(getClass(), "completed", SEE_OTHER);
    }

    public HttpResponse completed() {
        return templateEngine.render("cardOrder/completed");
    }

}
