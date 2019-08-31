package com.javajsjc.jdk8.methodreference;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 方案二
 * @date 2019/8/30 22:32
 */
public class TeacherComparator {

    public int compareTeacherByName(Teacher teacher1, Teacher teacher2){
        return teacher1.getName().compareTo(teacher2.getName());
    }

    public int compareTeacherByAge(Teacher teacher1, Teacher teacher2){
        return teacher1.getAge() - teacher2.getAge();
    }
}
