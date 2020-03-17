package com.example.util;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import sun.applet.Main;

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

        Integer i=0;
        System.out.println(i.equals(0));
    }
}


