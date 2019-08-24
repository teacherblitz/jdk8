package com.javajsjc.jdk8;

import org.junit.Test;

/**
 * @author zhuyuan
 * @version v1.0
 * @description
 * @date 2019/8/3 13:02
 */
public class FuntctionInterfaceTest {

    public String test(){
        return "";
    }

    @Test
    public void fun(){
        FunctionInterface functionInterface = new FunctionInterfaceImpl();
        int num = functionInterface.fun(1);
        System.out.println("结果->"+num);

        String funSrc = functionInterface.fun3();
        System.out.println("结果->"+funSrc);

        System.out.println("子类->"+functionInterface.getClass());
        System.out.println("父类->"+functionInterface.getClass().getSuperclass());


    }
}
