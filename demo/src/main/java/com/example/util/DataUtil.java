package com.example.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import sun.applet.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Sky
 * create 2020/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class DataUtil {

    public static void main(String[] args) {
        List<String> nlist = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        //2019-02-21 17:09:33  2020-02-21 17:09:33
        c.setTime(DateUtil.parseDate("2020-02-01 00:00:00").toJdkDate());
        Calendar c2 = Calendar.getInstance();
        c2.setTime(DateUtil.parseDate("2020-02-01 00:00:00").toJdkDate());
//            int num1 = Integer.parseInt(performance.getStartDate().substring(5,7));
//            int num2 = Integer.parseInt(performance.getEndDate().substring(5,7));
        while (c.before(c2)) {
            nlist.add(DateUtil.format(c.getTime(), "yyyy年MM月"));
            c.add(Calendar.MONTH, +1);
        }
        System.out.println(nlist.toString());

        System.out.println(new Date(1583717020000L).before(new java.util.Date()));

        Integer i = 0;
        System.out.println(i.equals(0));

        System.out.println(getMonthDiff(new Date(1579511757000L), new Date(1587460557132L)));


        System.out.println(getMonths("2020-01-01", "2020-04-01"));

        getfirstandlast();

        System.out.println(DateUtil.between(DateUtil.parseDate("2020-01-01"), DateUtil.parseDate("2020-04-01"), DateUnit.DAY));
    }


    /**
     * 获取两个日期相差的月数
     */
    public static int getMonthDiff(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 
        int yearInterval = year1 - year2;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if (month1 < month2 || month1 == month2 && day1 < day2) {
            yearInterval--;
        }
        // 获取月数差值
        int monthInterval = (month1 + 12) - month2;
        if (day1 < day2) {
            monthInterval--;
        }
        monthInterval %= 12;
        int monthsDiff = Math.abs(yearInterval * 12 + monthInterval);
        return monthsDiff;
    }


    /**
     * 获取两个日期之间的所有的月份
     *
     * @param startTime 开始日期
     * @param endTime   结束日期
     * @return
     */
    public static List<String> getMonths(String startTime, String endTime) {
        // 返回的日期集合
        List<String> months = new ArrayList<String>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        try {
            Date start = dateFormat.parse(startTime);
            Date end = dateFormat.parse(endTime);
            Calendar tempStart = Calendar.getInstance();
            tempStart.setTime(start);
            Calendar tempEnd = Calendar.getInstance();
            tempEnd.setTime(end);
            tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
            while (tempStart.before(tempEnd)) {
                months.add(dateFormat.format(tempStart.getTime()));
                tempStart.add(Calendar.MONTH, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return months;
    }

    //一个月的第一个和最后一天
    public static void getfirstandlast() {
        // 获取当前年份、月份、日期
        Calendar cale = null;
        cale = Calendar.getInstance();
        int year = cale.get(Calendar.YEAR);
        int month = cale.get(Calendar.MONTH) + 1;
        int day = cale.get(Calendar.DATE);
        int hour = cale.get(Calendar.HOUR_OF_DAY);
        int minute = cale.get(Calendar.MINUTE);
        int second = cale.get(Calendar.SECOND);
        int dow = cale.get(Calendar.DAY_OF_WEEK);
        int dom = cale.get(Calendar.DAY_OF_MONTH);
        int doy = cale.get(Calendar.DAY_OF_YEAR);

        System.out.println("Current Date: " + cale.getTime());
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Day of Week: " + dow);
        System.out.println("Day of Month: " + dom);
        System.out.println("Day of Year: " + doy);

        // 获取当月第一天和最后一天
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday, lastday;
        // 获取前月的第一天
        cale = Calendar.getInstance();
//        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        firstday = format.format(cale.getTime());
        // 获取前月的最后一天
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        lastday = format.format(cale.getTime());
        System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);

        // 获取当前日期字符串
        Date d = new Date();
        System.out.println("当前日期字符串1：" + format.format(d));
        System.out.println("当前日期字符串2：" + year + "/" + month + "/" + day + " "
                + hour + ":" + minute + ":" + second);
    }

}


