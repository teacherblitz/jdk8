package com.javajsjc.jdk8;

import org.junit.Test;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 函数式接口
 * @date 2019/8/3 11:58
 */
public class RunnableTest {

    @Test
    public void fun(){
        /**
         * 1.带有@FunctionalInterface
         * 2.如不是lambda表达式则会提示警告信息
         */
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("sss");
            }
        };

        new Thread(runnable).start();

    }

}
