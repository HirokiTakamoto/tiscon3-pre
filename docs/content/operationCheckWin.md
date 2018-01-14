# 自分のPCでtiscon3を動かす(Windows)

## 前提条件

* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `java -version` とコマンドを入力した時、結果が返ってきますか？
* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `mvn --version` とコマンドを入力した時、結果が返ってきますか？
* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `git --version` とコマンドを入力した時、結果が返ってきますか？

## IntelliJでプロジェクトをcloneする

1. ユーザフォルダ配下に `IdeaProjects` フォルダを作成します。(例) `C:\Users\ユーザ名\IdeaProjects`
1. IntelliJを起動し、 `Check out from Version Control > Git` を選択します。
1. Git Repository URLに `https://github.com/[Githubのユーザ名]/tiscon3.git` を入力します。
1. Cloneボタンを押下します。「The parent path～」と表示されている場合、Parent Directory項目右の `...` ボタンを押下し、作成した `IdeaProjects` フォルダを選択してください。
1. 画面下部にステータスが表示されます。バーの表示が消えればcloneは完了です。下図のような画面が表示された場合、『No』を選択し、下記の手順に従ってcloneしたプロジェクトを開いてください。<br>
![クローン時の手順](../image/intellij_clone-repository_confirm-checkout.png)

## プロジェクトを開く

プロジェクトのclone時に自動的にプロジェクトが開いた場合、以下の手順は飛ばしてください。

1. IntellijのWelcome画面からOpen を選択します。<br>
![プロジェクトを開く1](../image/intellij_top_open.png)

1. `C:\Users\ユーザ名\IdeaProjects\tiscon3` を選択し、OKを押します。<br>
![プロジェクトを開く2](../image/intellij_top_open_project.png)

1. tiscon3プロジェクトが開けました。続いてソースコードを確認できるようにします。<br>
![プロジェクトを開く3](../image/intellij_open.png)

## ソースコード確認

1. IntelliJ上部メニューバーから、`View > Tool Windows > Project` を選択します。<br>
![ProjectViewの表示](../image/intellij_open_project.png)

1. Project Viewよりプロジェクト内のソースコードが確認できるようになりました。<br>
![ソースコードの確認](../image/intellij_project-window.png)

## [Git](https://git-scm.com/)の設定

今後の作業内容をあなたのGitHubアカウントに紐付けられるようにします。

IntelliJ上部メニューバーから、`View > Tool Windows > Terminal` を選択します。

![Terminalの表示](../image/intellij_open_terminal.png)

Terminal画面が表示されるので、以下を入力してください。
```sh
git config user.name GitHubのユーザ名
git config user.email GitHubのメールアドレス
```
コマンド実行後、何もエラーメッセージが表示されなければ設定完了です。

## ローカルでの動作確認
cloneしたWebアプリケーションが正常に動くか、ローカル上で動作確認を行います。

1. Project Viewから `Application.java` を選択し、右クリックメニューから `Run 'Application.main()'` を実行します。<br>
![Main実行1](../image/intellij_run_application-main.png)

1. 画面下部にログが表示されます。起動が完了すると下図のようにログが表示されます。
起動後はブラウザから [http://localhost:3000](http://localhost:3000) にアクセスすることでトップページが開きます。<br>
![Main実行2](../image/intellij_run_application-main2.png)<br>
![Main実行3](../image/tiscon_top.png)

1. 動作が確認できたらアプリケーションを終了しましょう。ウィンドウ左下の停止ボタンを押します。<br>
![Main実行4](../image/intellij_stop_application-main.png)
