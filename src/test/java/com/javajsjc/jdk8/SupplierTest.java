package com.javajsjc.jdk8;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * @author zhuyuan
 * @version v1.0
 * @description suplier 学习->方法引用
 * @date 2019/8/13 23:24
 */
@Slf4j
public class SupplierTest {

    @Test
    public void fun(){
        Supplier<User> supplier = () -> new User();
        log.info("suplier->{}",supplier.get().getUsername());

        Supplier<User> supplier2 = User::new;
        System.out.println(supplier2.get().getUsername());
    }
}
