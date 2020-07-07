package com.example.test;

import cn.hutool.core.date.DateUtil;
import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.collect.Lists;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import sun.util.resources.cldr.rm.CalendarData_rm_CH;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

    private final static Logger LOGGER = LoggerFactory.getLogger(UserTest.class);


    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException, UnsupportedEncodingException {

        String json = "{\\x22UserId\\x22:\\x224240\\x22,\\x22UserName\\x22:\\x22\\xE6\\xB5\\x8B\\xE8\\xAF\\x95\\xE7\\x94\\xA8\\xE6\\x88\\xB72\\x22,\\x22CardId\\x22:\\x22\\x22,\\x22GenderId\\x22:\\x222\\x22,\\x22PassWord\\x22:\\x22\\x22,\\x22IdentityNo\\x22:\\x22\\x22,\\x22CridentialId\\x22:\\x22123123123\\x22,\\x22EmpDeptId\\x22:\\x220\\x22,\\x22SubCardId\\x22:\\x22\\x22,\\x22UserImage\\x22:\\x22\\x22,\\x22LockId\\x22:\\x227040,7041,7042,\\x22,\\x22CellPhone\\x22:\\x22               \\x22,\\x22RegisterTime\\x22:\\x222020-06-30 11:55:47.0\\x22,\\x22ExpiredTime\\x22:\\x222021-06-29 23:59:59.0\\x22,\\x22ID\\x22:\\x222020063011561588\\x22,\\x22operation\\x22:\\x221\\x22}";

        json = json.replaceAll("\\\\x22", "\"");
        System.out.println(json);
////        JSONObject.parseObject(json);
//        System.out.println(json);
//        System.out.println(Long.toOctalString(341226199603105552L));


        String s = "{\"meterReading\":1549420.0}";
        Double meterReading = JSONObject.parseObject(s).getDouble("meterReading");
        double v = new BigDecimal("0.001").multiply(new BigDecimal("1549420.0")).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(v);

    }


}
