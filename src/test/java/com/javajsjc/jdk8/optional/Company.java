package com.javajsjc.jdk8.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhuyuan
 * @version v1.0
 * @description
 * @date 2019/8/25 21:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company{

    private String company;
    private List<Staff> staffList;
}
