package com.javajsjc.jdk8.methodreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 方案一/二
 * @date 2019/8/29 22:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String name;
    private Integer age;


    // 方案一：设计观念不合理/原因在于此方法与该实体类属性无交集
    public static int compareTeacherByName(Teacher teacher1, Teacher teacher2){
        return teacher1.getName().compareTo(teacher2.getName());
    }

    public static int compareTeacherByAge(Teacher teacher1, Teacher teacher2){
        return teacher1.getAge() - teacher2.getAge();
    }

    // 方案三：
    public int compare(Teacher teacher){
        return this.age - teacher.getAge();
    }
}
