package com.example.test;

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
import org.hibernate.validator.constraints.ModCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.io.File;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.DoubleToIntFunction;

/**
 * @author Sky
 * create 2018/09/27
 * email sky.li@ixiaoshuidi.com
 **/

public class test01 {
    public static void main(String[] args) {
        try {
            User target = new User();
            target.setUsername("liqi");
//            target.setMoney(20);
            target.setBigDecimal(new BigDecimal("20"));
            User source = new User();
            source.setUsername("zhangsan");
            BeanCopier.create(User.class,User.class,false).copy(source,target,null);
            System.out.println(target);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hhehehe");
        }
    }

    private static int sayhello() throws Exception {
        int i = 1;
        int j = i / 0;
        return j;
    }
}
