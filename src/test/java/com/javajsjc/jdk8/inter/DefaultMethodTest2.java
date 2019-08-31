package com.javajsjc.jdk8.inter;

import org.junit.Test;

/**
 * @author zhuyuan
 * @version v1.0
 * @description
 * @date 2019/8/31 14:29
 */
public class DefaultMethodTest2 extends DefaultMethod1Impl implements DefaultMethod2{

    @Test
    public void fun2(){
        DefaultMethodTest2 test = new DefaultMethodTest2();
        test.myMethod();
    }
}
