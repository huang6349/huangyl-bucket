# huangyl-web

[![](https://img.shields.io/badge/java-^1.8.0-orange.svg?style=flat-square)](http://www.oracle.com/technetwork/java/index.html)
[![](https://jitpack.io/v/huang6349/huangyl-bucket.svg?style=flat-square)](https://jitpack.io/#huang6349/huangyl-bucket)

互联网操作模块

## 使用方式

* 添加`Maven`依赖

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.huang6349.huangyl-bucket</groupId>
    <artifactId>huangyl-web</artifactId>
    <version>0.0.2</version>
</dependency>
```

* 或者添加`Gradle`依赖

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

```groovy
dependencies {
    implementation 'com.github.huang6349.huangyl-bucket:huangyl-web:0.0.2'
}
```

## 功能说明

* RESTful 基于Message的RESTful消息工具类

* InternalServerErrorException 自定义服务器异常

* BadRequestException 自定义请求错误异常

* DataAlreadyExistException 自定义数据已经存在异常

* DataAlreadyIDException 自定义数据编号已存在异常

* ThrowableAdviceTrait 不抓全局异常返回统一消息的接口
