# Java8

- 包含xxx，其中最主要的是lambda表达式和stream api

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



- 来自Java技术教程作者朱老师的分享,联系邮箱：teacherblitz@gmail.com
