package com.javajsjc.jdk8;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description lambda表达式
 * @author zhuyuan
 * @date 2019/7/31 21:51
 * @version v1.0
 */
public class LambdaTest {

    @Test
    public void fun(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //原始for循环
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("------------------------");
        //jdk5开始引入增强版for循环
        for (Integer i: list) {
            System.out.println(i);
        }

        System.out.println("------------------------");
        //jdk8新特性
        list.stream().forEach(i-> System.out.println(i));

        System.out.println("------------------------");
        //函数式接口方法引用
        list.forEach(System.out::println);
    }

    @Test
    public void fun2(){
        // 循环打印集合
        List<String> list = Arrays.asList("hello","world","hello world");
        list.forEach(i-> System.out.println(i));

        // 循环赋值集合2
        List<String> list2 = new ArrayList<>();
        list.forEach(item -> list2.add(item.toUpperCase()));

        list2.forEach(item -> System.out.println("list2->"+item));
    }

}
