# IntelliJのインストール(Windows)

## 前提条件

* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `java -version` とコマンドを入力した時、結果が返ってきますか？
* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `mvn --version` とコマンドを入力した時、結果が返ってきますか？

## インストール

1. https://www.jetbrains.com/idea/#chooseYourEdition のDOWNLOADボタンから、**Community** のバージョンを選んでダウンロードしてください。
1. ダウンロードできたインストーラーを起動して、表示される手順に従ってインストールを進めてください。よくわからない項目はそのままYESを選択してください。

IntelliJを日本語化したい場合は、[IntelliJ IDEA 日本語化 | Qiita](http://qiita.com/makoto2468/items/6abf614b82cab865b745)が参考になります。

## プラグインの設定

1. スタートメニューやデスクトップに追加されるアイコンからIntelliJを起動し、`Configure` > `Settings` を選択します。<br>
![プラグイン設定1](../image/intellij_top_settings.png)

1. Settingsウィンドウが表示されるので、左のメニューからPluginsを選択し、 `Browse repositories...` ボタンを押下します。<br>
![プラグイン設定2](../image/intellij_setting_plugins.png)

1. 検索バーに `Lombok` と入力し、Lombok Pluginを選択します。
右側に表示されるInstallボタンを押下してください。<br>
![プラグイン設定3](../image/intellij_setting_install_lombok-plugin.png)

## SDKの設定

1. Welcome画面で[Configure]→[Project Defaults]⇒[Project Structure]と選択してください。<br>
![SDK設定1](../image/intellij_top_project-structure.png)

1. [Project SDK]という見出しの下にあるプルダウンが＜No SDK＞になっていると思いますので、【New...】→【JDK】を選択してください。<br>
![SDK設定2](../image/intellij_setting_jdk1.png)

1. ご自身がインストールしたjdkの場所(C:\Program Files\Java\jdk1.8.x_xxx)を選択して[OK]を押下してください。<br>
![SDK設定3](../image/intellij_setting_jdk1_select-home-directory.png)

1. Project SDKが設定され、【1.8(java version "1.8.x_xxx")】が選択されるかと思います。
一つ下の項目「Project language level」は「8 - Lambdas, type annotations etc.」を選択し、[OK]を押下してください。<br>
![SDK設定4](../image/intellij_setting_jdk2.png)
