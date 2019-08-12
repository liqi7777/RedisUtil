package com.example.test;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import sun.util.resources.cldr.rm.CalendarData_rm_CH;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sky
 * create 2018/11/06
 * email sky.li@ixiaoshuidi.com
 **/
public class UserTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat yyyyMMddFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = yyyyMMddFormat.parse("2019-01-01");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,-1);
        String previousDay = yyyyMMddFormat.format(calendar.getTime());
        System.out.println(previousDay);
        calendar.clear();
        calendar.setTime(new Date());
        System.out.println(yyyyMMddFormat.format(calendar.getTime()));
    }

}
