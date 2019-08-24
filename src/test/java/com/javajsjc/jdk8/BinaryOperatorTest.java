package com.javajsjc.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 二元运算符的函数
 * @date 2019/8/17 19:00
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        int result = test.compute(1, 2, (value, value2) -> value + value2);
        System.out.println(result);

        String str = test.getShort("hello123", "world", (a,b)->a.length()-b.length());
        // charAt(x) -> 24位字母下标
        System.out.println(str);
    }

    /**
     * 入二出一 继承自BiFunction
     * @param num1
     * @param num2
     * @param binaryOperator
     * @return
     */
    public int compute(int num1, int num2, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(num1,num2);
    }

    /**
     * 扩展了两个比较数值大小的静态方法：minBy->maxBy
     * @param a
     * @param b
     * @param comparator
     * @return
     */
    public String getShort(String a, String b, Comparator<String> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }
}
