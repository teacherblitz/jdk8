package com.teacherblitz.time;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * 日期案例1
 *
 * @author <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since 2020/8/16
 */
public class LocalTimeDemo1 {

    public static void main(String[] args) {
        // 日期LocalDate
        // 日期的操作类：TemporalAdjusters
        LocalDate firstLocalDate = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastLocalDate = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(String.format("[第一天]：%s,][最后一天]：%s",
                firstLocalDate,
                lastLocalDate));

        // 时间localTime
        LocalTime localTime = LocalTime.now();
        LocalTime newLocalTime = localTime.plusHours(1);
        System.out.println("当前时间+1：" + newLocalTime.getHour());

        // 日期和时间LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();

        // 解析与格式化DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y年-M月-d日 H时m分s秒");
        String formatDateTime = localDateTime.format(formatter);
        System.out.println("格式化：" + formatDateTime);
    }

}
