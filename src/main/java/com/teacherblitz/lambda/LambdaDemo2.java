package com.teacherblitz.lambda;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Lambda参数传递案例
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/15
 */
public class LambdaDemo2 {

    public static void main(String[] args) {
        // 使用匿名内部类作为参数传递
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // 使用Lambda作为参数传递
        TreeSet<String> ts2 = new TreeSet<>(
                (o1, o2) -> Integer.compare(o1.length(), o2.length())
        );
    }
}
