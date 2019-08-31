package com.javajsjc.jdk8.inter;

/**
 * @author zhuyuan
 * @version v1.0
 * @description
 * @date 2019/8/31 14:12
 */
public interface DefaultMethod2 {

    default void myMethod(){
        System.out.println("DefaultMethod2 myMethod...");
    }
}
