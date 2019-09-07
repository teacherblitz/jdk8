package com.javajsjc.jdk8.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author zhuyuan
 * @version v1.0
 * @description 时间特性示例
 * @date 2019/9/5 21:48
 */
public class DateTest {

    @Test
    public void fun(){

        Instant instant = Instant.now();
        System.out.println("瞬时示例："+instant);

        LocalDate localDate = LocalDate.now();
        System.out.println("本地日期："+localDate);
        
        // 获取具体日期
        System.out.printf("%d年-%d月-%d日%n",localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());

        // 检查闰年
        if(localDate.isLeapYear()){
            System.out.println("闰年");
        }else {
            System.out.println("NOT闰年");
        }

        // 处理特定日期
        LocalDate hocDate = LocalDate.of(localDate.getYear(), localDate.getMonthValue(),
                localDate.minus(1,ChronoUnit.DAYS).getDayOfMonth());
        // 加一天：localDate.plus(1, ChronoUnit.DAYS).getDayOfMonth()
        // 减一天：localDate.minus(1,ChronoUnit.DAYS).getDayOfMonth()
        System.out.println("特定日期："+hocDate);

        // 判断日期是否早于或晚于另一个日期
        if(localDate.isAfter(hocDate)){
            System.out.println("今天在特定日期之后");
        }
        if(localDate.isBefore(hocDate)){
            System.out.println("今天在特定日期之前");
        }

        LocalTime localTime = LocalTime.now();
        System.out.println("本地时间："+localTime);

        // 获取具体时间
        System.out.printf("%d时-%d分-%d秒%n",localTime.getHour(),localTime.getMinute(),localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("组合日期和时间："+localDateTime);

        // jdk7：线程不安全且每次使用需要创建消耗大量内存
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // jdk8：线程安全，推荐使用
        String date = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("格式化："+date);

        // 获取周几
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("今天是周："+dayOfWeek.getValue());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("最完整的日期时间："+zonedDateTime);
    }
}
