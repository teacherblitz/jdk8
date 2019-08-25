package com.javajsjc.jdk8.optional;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author zhuyuan
 * @version v1.0
 * @description OPE示例
 * @date 2019/8/25 15:19
 */
public class OptionalTest {

    @Test
    public void fun(){
        Optional<String> optional = Optional.empty();

        // 不推荐，不符合lambda表达式语法
        if(optional.isPresent()){
            System.out.println("optional1->"+optional.get());
        }

        // 推荐
        optional.ifPresent(item -> System.out.println("optional2->"+item));

        // 入参泛型类
        System.out.println("optional3->"+optional.orElse("world"));

        // 入参supplier函数
        System.out.println("optional14->"+optional.orElseGet("supplier"::toUpperCase));
    }

    @Test
    public void fun2(){
        // 初始化
        Staff staff = new Staff("zhangsan");
        Staff staff2 = new Staff("lisi");
        List<Staff> staffList = Arrays.asList(staff, staff2);
        Company company = new Company();
        company.setCompany("alibaba gourp");
        company.setStaffList(staffList);

        // 创建一个optional对象并赋值
        Optional<Company> optionalCompany = Optional.of(company);
        List<Staff> result = optionalCompany.map(comp -> comp.getStaffList()).orElse(Collections.emptyList());
        System.out.println("company->"+result);
    }
}
