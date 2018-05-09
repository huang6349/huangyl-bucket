# huangyl-commons

[![](https://img.shields.io/badge/java-^1.8.0-orange.svg?style=flat-square)](http://www.oracle.com/technetwork/java/index.html)
[![](https://jitpack.io/v/huang6349/huangyl-bucket.svg?style=flat-square)](https://jitpack.io/#huang6349/huangyl-bucket)

工具包模块

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
    <artifactId>huangyl-commons</artifactId>
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
    implementation 'com.github.huang6349.huangyl-bucket:huangyl-commons:0.0.2'
}
```

## 功能说明

* [Message](./huangyl-commons/src/main/java/org/hyl/bucket/commons/result/domain/Message.java) 统一的消息实体

* [ResultUtil](./huangyl-commons/src/main/java/org/hyl/bucket/commons/result/ResultUtil.java) 统一的消息工具类
