# Mavenのインストール(Windows)

## 前提条件

* [コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して `java -version` とコマンドを入力した時、結果が返ってきますか？

## インストール

下記サイトを参考に、**Maven3のインストール**及び**環境変数の設定**を行って下さい。

> **注意点**
> * 下記サイトには「環境変数の設定は3つ」と記載がありますが、この項目での**JAVA_HOME、M2_HOMEの設定は不要**です。
> * 環境変数「PATH」1つのみの設定を行って下さい。
> * 『手順2. 配置』では解凍して出来た『apache-maven-3.2.5』フォルダを、そのまま `C:\Program Files` に配置してください。
> * 環境変数のパス設定には、展開先のパスを反映するよう注意してください。たとえば `C:\Program Files` 配下にフォルダを配置した場合、環境変数に設定するパスは `C:\Program Files\apache-maven-3.2.5\bin` となります。

**[Apache Maven3 (3.5.0) インストール手順](https://weblabo.oscasierra.net/install-maven-35-windows/)**

## インストールできたら

[コマンドプロンプトを起動](tipsForWin.md#コマンドプロンプトの起動方法)して、

```sh
C:\Users\yourUserName>mvn --version
Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-04T04:39:06+09:00)
Maven home: C:\apache-maven-3.5.0\bin\..
Java version: 1.8.0_152, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_152\jre
Default locale: ja_JP, platform encoding: MS932
OS name: "windows 7", version: "6.1", arch: "amd64", family: "windows"
```
というように `mvn` コマンドが動くことが確認できればOKです。

またこの時表示されたバージョンが、自分がインストールしたMavenのバージョンと一致していることを確認してください。
