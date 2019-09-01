package com.javajsjc.jdk8.function;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 函数式接口
 * @date 2019/8/2 22:14
 */
@FunctionalInterface
public interface FunctionInterface {

    /**
     * 函数式接口：除静态/默认方法以外，有且只有一个抽象接口
     * @param num
     * @return
     */
    int fun(int num);

    /**
     * 重写object类toString方法
     * @return
     */
    String toString();

    /**
     * 静态方法一定要有方法体
     * 实现类不能够重写此方法
     */
    static void fun2(){
        System.out.println("static method");
    }

    /**
     * 默认方法一定要有方法体
     * 实现类可选择性实现此方法
     */
    default String fun3(){
        System.out.println("default method");
        return "我还在接口内，未被实现";
    }
}
