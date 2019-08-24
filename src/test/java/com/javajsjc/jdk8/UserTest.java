package com.javajsjc.jdk8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author zhuyuan
 * @version v1.0
 * @description stream API
 * @date 2019/8/10 12:07
 */
public class UserTest {

    @Test
    public void fun(){
        User user1 = new User("zhangsan",20);
        User user2 = new User("lisi",30);
        User user3 = new User("wangwu",40);

        List<User> users = Arrays.asList(user1,user2,user3);

        UserTest test = new UserTest();
        List<User> userResult = test.getUsersByUsername("zhangsan", users);
        userResult.forEach(user -> System.out.println(user.getUsername()));
    }

    /**
     * 1. 过滤 -> 执行一个动作/转换 -> stream api
     * 2. 过滤年龄-采用/相同方式或者BiFunction：(T,V)R
     * @param username
     * @param users
     * @return
     */
    public List<User> getUsersByUsername(String username,List<User> users){
        return users.stream().filter(user -> user.getUsername().equals(username)).
                collect(Collectors.toList());
    }

    /**
     * 初步认识predicate
     */
    @Test
    public void fun2(){
        Predicate<String> predicate = str -> str.length()>5;
        System.out.println(predicate.test("hello world"));
    }

    @Test
    public void fun3(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        UserTest test = new UserTest();

        List<Integer> resList1 = test.conditionFilter(list, value -> value % 2 == 0);
        System.out.println("resList1->"+resList1);

        List<Integer> resList2 = test.twoConditionFilter(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("resList2->"+resList2);

        boolean result = Predicate.isEqual(1).test(12);
        System.out.println(result);
    }

    /**
     * 单
     * @param list
     * @param predicate
     * @return
     */
    public List<Integer> conditionFilter(List<Integer> list,Predicate<Integer> predicate){
        return list.stream().filter(item -> predicate.test(item)).collect(Collectors.toList());
    }

    /**
     * 双and/or/negate
     * @param list
     * @param predicate
     * @param predicate2
     * @return
     */
    public List<Integer> twoConditionFilter(List<Integer> list,Predicate<Integer> predicate,
                                            Predicate<Integer> predicate2){
        return list.stream().filter(item -> predicate.and(predicate2).test(item)).collect(Collectors.toList());
    }
}
