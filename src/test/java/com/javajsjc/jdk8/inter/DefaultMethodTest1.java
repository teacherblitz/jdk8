package com.javajsjc.jdk8.inter;

import org.junit.Test;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 静态方法示例
 * @date 2019/8/31 14:11
 */
public class DefaultMethodTest1 implements DefaultMethod1,DefaultMethod2{

    /**
     * 同时实现具有相同方法的两个接口，必须重写该方法，不然编译器无法识别
     */
    @Override
    public void myMethod() {
//        DefaultMethod1.super.myMethod();
        System.out.println("DefaultMethodTest1 myMethod...");
    }

    @Test
    public void fun(){
        DefaultMethodTest1 test = new DefaultMethodTest1();
        test.myMethod();
    }
}
