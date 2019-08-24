package com.javajsjc.jdk8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author zhuyuan
 * @version v1.0
 * @description stream示例
 * @date 2019/8/7 21:51
 */
public class FunctionTest {

    /**
     * 函数式接口Comparator应用的demo
     */
    @Test
    public void fun(){
        List<String> list = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("方法一："+list);

        // expression->表达式 o2.compareTo(o1)
        // statement->语句 {return o2.compareTo(o1);}
        /*Collections.sort(list,(o1,o2)->{
            return o2.compareTo(o1);
        });
        System.out.println("方法二："+list);*/

        // 方法三：新特性Comparator.reverseOrder
    }

    /**
     * 如何传递一种行为/核心
     */
    @Test
    public void fun2(){
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1,value -> {return 3 * value;}));
        System.out.println(functionTest.compute(1,value -> 4 + value));
        System.out.println(functionTest.compute(3,value -> value * value));

        System.out.println(functionTest.convert(3,value -> String.valueOf(value+"hello world")));
    }

    /**
     * 高阶函数：函数中包含另一个函数/或者是作为参数/返回值传播
     * 事先定义好执行的方式，行为/动作由调用者自定义
     * @param num
     * @param function
     * @return
     */
    public int compute(int num, Function<Integer,Integer> function){
        Integer result = function.apply(num);
        return result;
    }

    public String convert(int num,Function<Integer,String> function){
        return function.apply(num);
    }

    /**
     * 事先定义好行为
     * @param a
     * @param b
     * @return
     */
    public int method1(int a,int b){
        return a+b;
    }

    public int method(int a,int b){
        return a*b;
    }




    @Test
    public void defaultMethodFun(){
        FunctionTest test = new FunctionTest();
        // 入一出一
        System.out.println("compute->"+test.compute(2,value -> 3 * value,value -> value * value));
        System.out.println("compute2->"+test.compute2(2,value -> 3 * value,value -> value * value));
        // 入二出一
        System.out.println("compute3->"+test.compute3(1,2,(value1,value2) -> value1 + value2));

        System.out.println("compute4->"+test.compute4(2,3,(value1,value2) -> value1+value2,value -> value * value));
    }

    /**
     * before
     * @param num
     * @param function1
     * @param function2
     * @return
     */
    public int compute(int num,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(num);
    }

    /**
     * after
     * @param num
     * @param function1
     * @param function2
     * @return
     */
    public int compute2(int num,Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(num);
    }

    public int compute3(int num1, int num2, BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(num1,num2);
    }

    /**
     * 使用function/不使用compose的原因java只能返回一个参数，导致无法使用再次计算无法BiFunction
     * @param num1
     * @param num2
     * @param biFunction
     * @param function
     * @return
     */
    public int compute4(int num1,int num2,BiFunction<Integer,Integer,Integer> biFunction,
                        Function<Integer,Integer> function){
        return  biFunction.andThen(function).apply(num1,num2);
    }
}
