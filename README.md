# Java8

- Java 8 (又称为 jdk 1.8) 是 Java 语言开发的一个主要版本。 Oracle 公司于 2014 年 3 月 18 日发布 Java 8 ，它支持函数式编程，新的 JavaScript 引擎，新的日期 API，新的Stream API 等。
#### Java8 新增了非常多的特性，我们主要讲解以下几个：
- Lambda 表达式：Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中)。
- 方法引用：方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
- 接口：从jdk8开始，接口可以定义为函数式接口，并新增了两种类型的方法，【静态方法和默认方法】打破了接口以前的定义“实现这个接口就一定要实现接口中的所有方法”，具体请看示例。
- Stream API：新添加的Stream API（java.util.stream） 把真正的函数式编程风格引入到Java中。
- Date Time API：加强对日期与时间的处理。
- Optional 类：Optional 类已经成为 Java 8 类库的一部分，用来解决空指针异常。
### lambda表达式语法
``` java
 (param1,param2,param3) -> {代码体}
```

### 函数式接口(根据源码翻译得如下结论)
1. 如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口。
2. 如果我们在某个接口上声明了FunctionalInterface注解，那么编辑器就会按照函数式接口的定义来要求该接口。
3. 如果某个接口只有一个抽象方法，但我们并没有给该接口声明FunctionalInterface注解，那么编辑器依旧会将该接口看作是函数式接口。
4. 例如：Runnable从jdk8开始加上@FunctionalInterface注解
5. 注意：如果一个接口它声明了一个抽象方法，并且重新写了Object中的抽象接口，接口中的抽象方法不会+1，所以编译器不会报错
6. 方法引用 System.out::println

### Stream API
1. jdk8中的stream与java.io包里的输入输出流是完全不同的概念，jdk8中的stream是对集合以及对象功能的增强

### OPE
1. jdk8中对null值的处理的示例，Optional类



- 来自Java技术教程作者朱老师的分享,联系邮箱：teacherblitz@gmail.com
