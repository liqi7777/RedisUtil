package com.example.java8LocalDataTime;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Sky
 * create 2020/06/18
 * email sky.li@ixiaoshuidi.com
 **/
public class LocalDateTimeTest {

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusDays(7);

        System.out.println("开始时间：" + startTime.format(df) + "，结束时间：" + endTime.format(df));

        LocalDateTime dateTest = LocalDateTime.parse("2018-02-30 12:12:12", df);
        System.out.println("时间自动转化：" + dateTest.toString());

        int daysNum = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getDays();
        int monthNum = Period.between(startTime.toLocalDate(), endTime.toLocalDate()).getMonths();
        System.out.println("相差天数：" + daysNum);
        System.out.println("相差月数：" + monthNum);

        System.out.println("当前时间向前推6天：" + LocalDateTime.now().minusDays(6));
        System.out.println("当前时间向前推6小时：" + LocalDateTime.now().minusHours(6));


        //本月的第一天
        LocalDate today = LocalDate.now();
        LocalDate firstday = LocalDate.of(today.getYear(), today.getMonth(), 1);
        LocalDate firstday01 = today.with(TemporalAdjusters.firstDayOfMonth());
        //本月的最后一天
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月的第一天" + firstday);
        System.out.println("本月的第一天" + firstday01);
        System.out.println("本月的最后一天" + lastDay);
    }
}
