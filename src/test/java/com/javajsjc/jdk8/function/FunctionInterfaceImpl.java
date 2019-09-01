package com.javajsjc.jdk8.function;

import com.javajsjc.jdk8.function.FunctionInterface;

/**
 * @author zhuyuan
 * @version v1.0
 * @description
 * @date 2019/8/3 13:00
 */
public class FunctionInterfaceImpl implements FunctionInterface {

    @Override
    public int fun(int num) {
        System.out.println("实现类...");
        return ++num;
    }
}
