package com.javajsjc.jdk8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zhuyuan
 * @version v1.0
 * @description Stream示例
 * @date 2019/8/31 17:06
 */
public class StreamTest {

    @Test
    public void fun(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        // 映射->聚合求和
        System.out.println(list.stream().map(i -> 2*i).reduce(0,Integer::sum));
    }

    @Test
    public void fun2(){
        Stream<String> stream = Stream.of("hello", "world", "hello world");

        // lambda表达式
        //String[] arr = stream.toArray(length -> new String[length]);

        // 方法引用
        String[] arr = stream.toArray(String[]::new);
        Arrays.asList(arr).forEach(System.out::println);
    }

    @Test
    public void fun3(){
        Stream<String> stream = Stream.of("hello", "world", "hello world");
        // 搜集->转换成一个list集合
        List<String> list = stream.collect(Collectors.toList());
        list.forEach(System.out::println);
    }

}
