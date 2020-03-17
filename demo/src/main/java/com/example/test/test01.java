package com.example.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import com.example.util.PageBean;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Sky
 * create 2018/09/27
 * email sky.li@ixiaoshuidi.com
 **/

public class test01 {
    public static void main(String[] args) {
//        List<String> Stringlists = new ArrayList<>();
//        Stringlists.add("a");
//        Stringlists.add("b");
//        Stringlists.add("c");
//        PageBean<String> pageBean = PageBean.generatePageBean(Stringlists, 1, 2);
//        System.out.println(JSONObject.toJSONString(pageBean));
//        List<Integer> integerList = new ArrayList<>();
////        integerList.add(1);
////        integerList.add(2);
////        integerList.add(3);
////        integerList.add(4);
////        integerList.add(5);
//        PageBean<Integer> integerPageBean = PageBean.generatePageBean(integerList, 1, 2);
//        System.out.println(JSONObject.toJSONString(integerPageBean));
//
//        DateTime yesterday = DateUtil.yesterday();
//        DateUtil.now();
        DateTime yyyyMM = DateUtil.parse("201902", "yyyyMM");
        DateTime dateTime = DateUtil.beginOfMonth(yyyyMM);
        DateTime dateTime1 = DateUtil.endOfMonth(yyyyMM);
        System.out.println(dateTime.toString());
//        System.out.println(dateTime1.toString());
//        System.out.println(yyyyMM.getTime());
//        long between = DateUtil.between(dateTime, dateTime1, DateUnit.SECOND);
//        System.out.println(between);
//
//        User user = new User();
//        user.setUsername("liqi");
//        user.setMoney(20);
//        System.out.println(user.toString());
//
//        System.out.println(DateUtil.beginOfDay(DateUtil.parse("20200228", "yyyyMMdd")).toString());
//        System.out.println(DateUtil.endOfDay(DateUtil.parse("20200228", "yyyyMMdd")).toString());
//
//        System.out.println(DateUtil.formatDate(new Date()));
//
//
//        BigDecimal totalFeeAmt = new BigDecimal("0.0001").multiply(new BigDecimal("26")).multiply(new BigDecimal(247500)).setScale(0, BigDecimal.ROUND_HALF_UP);
//        System.out.println(totalFeeAmt.toString());
//
//        System.out.println(Double.valueOf("2425.25"));
//        System.out.println(Double.parseDouble("12.13") + 6.305);
//        double d = Double.valueOf("2425") - Double.parseDouble("12.13") + 6.305;
//        System.out.println(d);
//
//        double v = Double.parseDouble("2421.01") * Double.parseDouble("0.26") / 100;
//        System.out.println(v);

        System.out.println("3fa0cce45cff1f81b1f49fe29bcb7822".length());
        String s="{\"meterReading\":0.322}";
        double d =JSONObject.parseObject("{\"meterReading\":0.322}").getDouble("meterReading");
        System.out.println(d);
        Double d1=0.322;
        Double d2=0.3;
        System.out.println(d1.compareTo(d2));
        String stackTrace = Thread.currentThread().getStackTrace()[1].getMethodName();

        System.out.println(Thread.currentThread().getStackTrace());
    }

    private static int sayhello() throws Exception {
        int i = 1;
        int j = i / 0;
        return j;
    }
}
