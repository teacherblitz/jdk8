package com.javajsjc.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhuyuan
 * @version v1.0
 * @description entity
 * @date 2019/8/5 21:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username="zhulaoshi";

    private Integer age;

}
