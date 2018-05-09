# huangyl-data

[![](https://img.shields.io/badge/java-^1.8.0-orange.svg?style=flat-square)](http://www.oracle.com/technetwork/java/index.html)
[![](https://jitpack.io/v/huang6349/huangyl-bucket.svg?style=flat-square)](https://jitpack.io/#huang6349/huangyl-bucket)

数据操作模块

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
    <artifactId>huangyl-data</artifactId>
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
    implementation 'com.github.huang6349.huangyl-bucket:huangyl-data:0.0.2'
}
```

* 开启`@EnableDataModule`

```java
@SpringBootApplication
@EnableDataModule
public class ExampleApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
```

## 功能说明

* [AbstractAuditingEntity](./src/main/java/org/hyl/bucket/data/auditing/domain/AbstractAuditingEntity.java) 数据审计的超类

* [AbstractIdAuditingEntity](./src/main/java/org/hyl/bucket/data/auditing/domain/AbstractIdAuditingEntity.java) 带ID的数据审计超类

* [AbstractLevelAuditingEntity](./src/main/java/org/hyl/bucket/data/auditing/level/domain/AbstractLevelAuditingEntity.java) 树形结构的数据审计超类

* [PaginationUtil](./src/main/java/org/hyl/bucket/data/commons/pagination/PaginationUtil.java) 基于Message的分页消息工具类
