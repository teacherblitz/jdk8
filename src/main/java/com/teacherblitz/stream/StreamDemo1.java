package com.teacherblitz.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream案例1
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/15
 */
public class StreamDemo1 {

    public static void main(String[] args) {
        String[] arr = new String[]{"z","y","x","za","ya","xa"};
        List<String> collect = Stream.of(arr)
                .sorted()
                .filter(item -> item.length() > 1)
                .collect(Collectors.toList());
    }
}
