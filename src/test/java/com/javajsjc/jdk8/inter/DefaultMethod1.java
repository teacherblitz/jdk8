package com.javajsjc.jdk8.inter;

/**
 * @description 
 * @author zhuyuan
 * @date 2019/8/31 16:58
 * @version v1.0
 */
public interface DefaultMethod1 {

    default void myMethod(){
        System.out.println("DefaultMethod1 myMethod...");
    }
}
