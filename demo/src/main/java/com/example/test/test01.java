package com.example.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;
import cn.hutool.core.text.csv.CsvUtil;
import cn.hutool.core.text.csv.CsvWriter;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import net.sf.cglib.beans.BeanCopier;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.hibernate.validator.constraints.ModCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;

/**
 * @author Sky
 * create 2018/09/27
 * email sky.li@ixiaoshuidi.com
 **/

public class test01 {
    public static void main(String[] args) {
////        System.out.println(Optional.of(null));
////        BigDecimal currentReading = new BigDecimal("00017326").divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);
////        System.out.println();
////        System.out.println(currentReading);
//        String data = "8.00m³";
//        if (StringUtils.isNotBlank(data) && data.contains("m³")) {
//            String s = data.split("m³")[0];
//            System.out.println(s);
//        }
//        System.out.println(java.util.UUID.randomUUID().toString().replaceAll("-", ""));
//
//        List<Integer> userids01 = new ArrayList<>();
//        userids01.add(6);
//        List<Integer> userids02 = new ArrayList<>();
//        userids02.add(1);
//        userids02.add(2);
//        userids02.addAll(userids01);
////        userids01.addAll(userids02);
//        System.out.println(userids02);
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Double result = list.stream().collect(Collectors.collectingAndThen(Collectors.averagingLong(v -> v * 2),
//                s -> s * s));
//        System.out.println(result);
//
//        Date date = new Date(1566638298000L);
//        String format = DateFormatUtils.format(date, "yyyy-MM-dd 00:00:00");
//        System.out.println(format);
//        String format1 = DateFormatUtils.format(date, "yyyy-MM-dd 23:59:59");
//        System.out.println(format1);
//
//        Date date1 = DateUtils.addMonths(new Date(), -1);
//        System.out.println(date1);
//
//        Long l=30_000L;
//        System.out.println(l);
//
//        System.out.println("8737b92b0b9e68a07bcd1f895637df4a".length());

//        String encodeString = "李";
//        try {
//            byte[] bytes = encodeString.getBytes("utf-8");
//            for (byte aByte : bytes) {
//                System.out.println(aByte);
//            }
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }


       String  htjsonstr = "{\n" +
                "        \"khh\":\"江苏银行\",\n" +
                "        \"jzyhzh\":\"18320188000337289\",\n" +
                "        \"fkzq\":3,\n" +
                "        \"htqdsj\":\"2020-01-09\",\n" +
                "        \"zljzsj\":\"2020-02-08\",\n" +
                "        \"fwcode\":\"413700\",\n" +
                "        \"qyhtbh\":\"ZKZLHT202001090004\",\n" +
                "        \"fkfs\":3,\n" +
                "        \"zjje\":1000,\n" +
                "        \"jzfs\":2,\n" +
                "        \"zzjje\":1000,\n" +
                "        \"yjje\":1000,\n" +
                "        \"htqddd\":\"杭州拱墅和睦西湖路1号\",\n" +
                "        \"zlqssj\":\"2020-01-09\"\n" +
                "    }";
        JSONObject jsonObject = JSONObject.parseObject(htjsonstr);
        System.out.println(jsonObject.toJSONString());

    }

    private static int sayhello() throws Exception {
        int i = 1;
        int j = i / 0;
        return j;
    }
}
