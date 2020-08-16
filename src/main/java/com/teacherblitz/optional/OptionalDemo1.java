package com.teacherblitz.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 对空的处理案例
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/16
 */
public class OptionalDemo1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        if (optional.isPresent()) {
            String oDO = optional.orElseGet("null"::toUpperCase);
            System.out.println(oDO);
        }

        OptionalDO aDo0 = new OptionalDO().setOptional("1");
        Optional<OptionalDO> optionalDO = Optional.ofNullable(aDo0);
        optionalDO.ifPresent(arg0 -> System.out.println(arg0));
    }

    @Data
    @Accessors(chain = true)
    static class OptionalDO {

        String optional;
    }
}
