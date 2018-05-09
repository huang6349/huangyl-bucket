# huangyl-web

[![](https://img.shields.io/badge/java-^1.8.0-orange.svg?style=flat-square)](http://www.oracle.com/technetwork/java/index.html)
[![](https://jitpack.io/v/huang6349/huangyl-bucket.svg?style=flat-square)](https://jitpack.io/#huang6349/huangyl-bucket)

互联网操作模块

## 下载

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

## 文档

* ### 基于[Message.java](../huangyl-commons/src/main/java/org/hyl/bucket/commons/result/domain/Message.java)的RESTful消息工具类 -> [RESTful.java](./src/main/java/org/hyl/bucket/web/commons/rest/RESTful.java)

* ### 自定义服务器异常 -> [InternalServerErrorException.java](./src/main/java/org/hyl/bucket/web/errors/InternalServerErrorException.java)

* ### 自定义请求错误异常 -> [BadRequestException.java](./src/main/java/org/hyl/bucket/web/errors/BadRequestException.java)

* ### 自定义数据已经存在异常 -> [DataAlreadyExistException.java](./src/main/java/org/hyl/bucket/web/errors/DataAlreadyExistException.java)

* ### 自定义数据编号已存在异常 -> [DataAlreadyIDException.java](./src/main/java/org/hyl/bucket/web/errors/DataAlreadyIDException.java)

* ### 捕抓全局异常返回统一消息的接口 -> [ThrowableAdviceTrait.java](./src/main/java/org/hyl/bucket/web/errors/ThrowableAdviceTrait.java)
