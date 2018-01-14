package jp.co.tis.tiscon3.controller;

import enkan.data.HttpResponse;
import kotowari.component.TemplateEngine;

import javax.inject.Inject;

public class IndexController {

    @Inject
    private TemplateEngine templateEngine;

    public HttpResponse index() {
        return templateEngine.render("index");
    }

}
