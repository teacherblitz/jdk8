package com.teacherblitz.lambda;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * Lambda无参传递案例
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/15
 */
public class LambdaDemo1 {

    public static void main(String[] args) {

        // 匿名内部类 实现
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("<<<匿名类>>>");
            }
        };

        // Lambda 实现=>语法一：
        Runnable lambdaRunnable = () -> System.out.println("<<<Lambda>>>");

        runnable.run();
        lambdaRunnable.run();

        customerFun("单个参数的Lambda=>消费性函数");

        // 作为参数传递 Lambda 表达式
        argsToFun((args0, args1) -> args0.add(args1).setScale(2, BigDecimal.ROUND_HALF_UP),
                new BigDecimal(100.01), new BigDecimal(100.04));
    }

    /**
     * Lambda需要一个参数
     */
    public static void customerFun(String o1) {
        // 语法二：
        Consumer<String> fun = (args) -> System.out.println(args);
        // 语法三：
        Consumer<String> fun2 = args2 -> System.out.println(args2);
        fun.accept(o1);
        fun2.accept(o1);
    }

    /**
     * 算数运算符案例
     */
    public static void binaryOperatorFun() {
        // 语法四：
        BinaryOperator<Integer> bo = (x, y) -> {
            System.out.println("实现函数接口方法");
            return x + y;
        };
        // 语法五：
        BinaryOperator<Integer> bo2 = (x, y) -> x + y;
        // 语法六：
        BinaryOperator<Integer> bo3 = (Integer x, Integer y) -> {
            System.out.println("实现函数接口方法");
            return x + y;
        };
    }

    /**
     * 作为参数传递 Lambda 表达式
     * @param fun
     * @param args0
     * @param args1
     * @return
     */
    public static BigDecimal argsToFun(BinaryOperator<BigDecimal> fun,
                                    BigDecimal args0, BigDecimal args1) {
        return fun.apply(args0, args1);
    }
}
