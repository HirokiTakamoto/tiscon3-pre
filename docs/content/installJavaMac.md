# Javaのインストール(Mac)

## 前提条件

なし

## インストール

[MacでのJavaのインストール方法 | java.com](https://java.com/ja/download/help/mac_install.xml)の手順に従ってください。

## インストールできたら

[Terminalを起動](tipsForMac.md#terminalの起動方法) して
```sh
> echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home
```
というように `echo` コマンドが動くことと、
```sh
> java -version
java version "1.8.0_152"
Java(TM) SE Runtime Environment (build 1.8.0_152-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.152-b16, mixed mode)
```
というように `java` コマンドが動くことが確認できればOKです。

またこの時、`java -version`で表示されたバージョンが、自分がインストールしたJavaのバージョンと一致していることを確認してください。
