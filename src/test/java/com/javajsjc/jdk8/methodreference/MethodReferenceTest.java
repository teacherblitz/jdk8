package com.javajsjc.jdk8.methodreference;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 方法引用示例
 * @date 2019/8/29 21:56
 */
public class MethodReferenceTest {

    @Test
    public void fun(){
        Teacher teacher1 = new Teacher("zhangsan",10);
        Teacher teacher2 = new Teacher("lisi",30);
        Teacher teacher3 = new Teacher("wangwu", 90);
        Teacher teacher4 = new Teacher("zhaoliu", 40);

        List<Teacher> teacherList = Arrays.asList(teacher1, teacher2, teacher3, teacher4);
        // lambda表达式的方式
        //teacherList.sort((teacher1Param,teacher2Param) -> Teacher.compareTeacherByAge(teacher1Param,teacher2Param));

        // 方法引用一：类名 :: 静态方法名
        //teacherList.sort(Teacher :: compareTeacherByName);

        TeacherComparator teacherComparator = new TeacherComparator();

        // lambda表达式的方式
        //teacherList.sort((tea1, tea2) -> teacherComparator.compareTeacherByAge(tea1,tea2));

        // 方法引用二：引用名(对象名):: 实例方法名
        //teacherList.sort(teacherComparator::compareTeacherByAge);

        // 方法引用三：类名::实例方法名->注意：this代表调用者
        //teacherList.sort(Teacher :: compare);

        //teacherList.forEach(item -> System.out.println(item.getAge()));

        //方法引用四：构造方法->类名::new
        MethodReferenceTest test = new MethodReferenceTest();
        // 无参
        System.out.println(test.getString(String::new));

        // 有参
        System.out.println(test.getStr("hello", String::new));

    }

    /**
     * collections排序
     */
    @Test
    public void fun2(){
        List<String> citys = Arrays.asList("beijing","shanghai","guangzhou","shenzhen");

        // lambda表达式
        Collections.sort(citys, (val1,val2) -> val1.compareToIgnoreCase(val2));

        // 方法引用
        Collections.sort(citys, String::compareToIgnoreCase);
        citys.forEach(System.out::println);
    }

    public String getString(Supplier<String> supplier){
        return supplier.get()+"test";
    }

    public String getStr(String str, Function<String,String> function){
        return function.apply(str);
    }
}
