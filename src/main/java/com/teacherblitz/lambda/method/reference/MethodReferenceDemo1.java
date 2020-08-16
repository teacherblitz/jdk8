package com.teacherblitz.lambda.method.reference;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 方法引用
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/15
 */
public class MethodReferenceDemo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        // 示例方法
//        list.stream().forEach(System.out::println);

        Integer sum = list.stream()
                .skip(1)
                // 静态方法
                .reduce(Integer::sum)
                .get();
//        System.out.println(sum);

        List<User> users = Arrays.asList(new User[]{
                new User().setName("zhangsan"),
                new User().setName("lisi")
        });
        // 构造方法
        List<UserVO> collect = users.stream().map(UserVO::new).collect(Collectors.toList());
        collect.stream().map(UserVO::getName).forEach(System.out::println);
    }

    @Data
    @Accessors(chain = true)
    static
    class User{
        String name;
    }

    @Data
    static
    class UserVO{
        String name;

        UserVO(User user) {
            this.setName(user.getName());
        }
    }
}