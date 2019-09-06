package com.example.test;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import sun.util.resources.cldr.rm.CalendarData_rm_CH;

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
    public static void main(String[] args) throws ParseException, NoSuchAlgorithmException, UnsupportedEncodingException {
//        SimpleDateFormat yyyyMMddFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = yyyyMMddFormat.parse("2019-01-01");
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_YEAR, -1);
//        String previousDay = yyyyMMddFormat.format(calendar.getTime());
//        System.out.println(previousDay);
//        calendar.clear();
//        calendar.setTime(new Date());
//        System.out.println(yyyyMMddFormat.format(calendar.getTime()));

//        String brand = "bite";
//        String s = brand.split("-")[0];
//        System.out.println(s);
//
//        BigDecimal currentReading = new BigDecimal("00021648").divide(BigDecimal.valueOf(100), 2, BigDecimal.ROUND_HALF_UP);
//        System.out.println(currentReading);
//        System.out.println("COwGy4wE23NkgS8J3Jkp8PpIhMuik+fSKzEebGJ0N6r45yL29cwYxwr4PSzQ6TjQM3R6kSy/Y+byrq6Mcos67ml73vrQeSyMBdijze2LQKqPjEk8u1vISgMVWF98UZRtcp42nU7Tzg/1GSN/y1YrhYkRaraRUMCqf7JagzYEGDJo5jF+vntqdMSDUaJAeXReQq8WlV99ltbtWty/wIq0Ii4LiInNP9oBaIS87tlBAbW5sO5xL/dDV4KCv2/V/igv3ZL7W6hPgOzl9s7MN3vZd/0i1QOSFdhanyEVFfq9VjbozDvOhoeOYATSpXpBFd+rvBTi3BvQo/ah4ChQr15wSQ==".equals("COwGy4wE23NkgS8J3Jkp8PpIhMuik+fSKzEebGJ0N6r45yL29cwYxwr4PSzQ6TjQM3R6kSy/Y+byrq6Mcos67ml73vrQeSyMBdijze2LQKqPjEk8u1vISgMVWF98UZRtcp42nU7Tzg/1GSN/y1YrhYkRaraRUMCqf7JagzYEGDJo5jF+vntqdMSDUaJAeXReQq8WlV99ltbtWty/wIq0Ii4LiInNP9oBaIS87tlBAbW5sO5xL/dDV4KCv2/V/igv3ZL7W6hPgOzl9s7MN3vZd/0i1QOSFdhanyEVFfq9VjbozDvOhoeOYATSpXpBFd+rvBTi3BvQo/ah4ChQr15wSQ=="));
        System.out.println("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlsjcUZOpelTt/MHh4H1EkyWK8whFpIbLPBhCDyZtZOG2uASDLzJFLY0UIX2gWBPGcpvq5CgkeIvrhtYPUGS0LGJGZ9rCzW1aX8N9v5DEN9kZSfDiQqJMkTDffbEIwKYDlH5tqvG8XnM/voBpDgdNO5+2NBgB0ogWACekwtMlp1M1eNj8z7xn175fL33QsI8GCDy3vaRYGMHp0EGAzq88ZbHM8B+Z9izL7caFM9B/DVx5Zz3rqBGGStLNtMFz3ilMxEVO6iwebrRQL9s9UQ65NEHcP9sGS/+ZB4Tx2OjYhCCDKRgOXF8m8RJXiGIjJ1NWRZvSLjyYehIy1YzTJDj4awIDAQAB".equals("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlsjcUZOpelTt/MHh4H1EkyWK8whFpIbLPBhCDyZtZOG2uASDLzJFLY0UIX2gWBPGcpvq5CgkeIvrhtYPUGS0LGJGZ9rCzW1aX8N9v5DEN9kZSfDiQqJMkTDffbEIwKYDlH5tqvG8XnM/voBpDgdNO5+2NBgB0ogWACekwtMlp1M1eNj8z7xn175fL33QsI8GCDy3vaRYGMHp0EGAzq88ZbHM8B+Z9izL7caFM9B/DVx5Zz3rqBGGStLNtMFz3ilMxEVO6iwebrRQL9s9UQ65NEHcP9sGS/+ZB4Tx2OjYhCCDKRgOXF8m8RJXiGIjJ1NWRZvSLjyYehIy1YzTJDj4awIDAQAB"));
        System.out.println("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWyNxRk6l6VO38weHgfUSTJYrzCEWkhss8GEIPJm1k4ba4BIMvMkUtjRQhfaBYE8Zym+rkKCR4i+uG1g9QZLQsYkZn2sLNbVpfw32/kMQ32RlJ8OJCokyRMN99sQjApgOUfm2q8bxecz++gGkOB007n7Y0GAHSiBYAJ6TC0yWnUzV42PzPvGfXvl8vfdCwjwYIPLe9pFgYwenQQYDOrzxlsczwH5n2LMvtxoUz0H8NXHlnPeuoEYZK0s20wXPeKUzERU7qLB5utFAv2z1RDrk0Qdw/2wZL/5kHhPHY6NiEIIMpGA5cXybxEleIYiMnU1ZFm9IuPJh6EjLVjNMkOPhrAgMBAAECggEASPmxV3HlpiUQgTG8hg9abvTOiMzKF9R86/q5jeeFLjvnWKwmaWMlA+Sxh3vrbHU1qCY5ym57KDRfqwRSqQ/z+z8c4AqKGS4BfTN52orPzE+v449HkgRGlkZXA9f4anRuayG9JeyUxAl3IlW3gmiaQm8Lma68ww3FyBFntjrGkHH64oB77ZabwowmfYMhxpjls7e8WHuabLgalJ8thSovFWBrxIVEeeOTW1kkJLai+Z4CfGG1V/i18PndCHL0Ehlh5L/7smt0SI90YuERC7wpiepZz0AOhmZpAAmsYcbqF0yVWck/rb+xzfQudVqT1hfI3Ke+keXjdsBmIz5Ze7mJsQKBgQD8HgI04/WWA+/+DxNOwFTJUNhWBrCnYwYralpUtTk33gL+W+O4BFl1lKS9yom3al1vYh/DsmcxJFFa8Lbn3UYDW4FvIXG6GvOZx02Ju48vNjC72YkmLjvRwb+g2L3Sw3vUhlp6vbpctPV04xdTQn/SqPwc9QOnAgXbW/wad/5V7QKBgQCZG1coJPbdPytFCrUv+F+3kfJWDuU0Dos1qtUXf8oFHVuZvONNUEYAdsPeD1ubGSIp8jrTsxxD7d0zZ6jAv3OZO0scP+3pjI86mDnb9yYqTPBYB3Pv+vyewHqO6R9ijXeG7Ds7dXQoL4F/JgjUPzGRO3mR7F2PG+jKDjMCfZ48twKBgE5GFtNK7wVbRZhwH8N0bR5vjirvOstNMC4sf80K0q/oqq9D4ihQmWGq+5a9GhKq4EVjho8ghW85YlTEpVTJWyJRt5bEIGXyVi0pNoaLh8HVpj28JRuIgSP3bkJG6HBWJsztxYuT+hcsS4S1uJkt7Td/JX7sBu1D8IORRG0HUhxlAoGBAI0Z41L97fyssMXqPl09O4lEGeAxzg4RsT3+eHA1twrLqZWfvKON7VWUHqLR6IyhtxiNQqXDlbMMziUHzUAFsRVwzaH1UN9CSOWpUPllZmjpiz61b6Wk25e6r7hxJBmBYryXjWcYsbovPdreRJjGvHmqJDnVacvv3rQILf6HooM1AoGAFJmR0RvlWv4FjkrV3fwqBA/PLr+jf5+Einbuv5Lo2aV5AWgoKL4qjBcoYU5TK8Q0PFyZos+TlEs+wnZ0z3IONQwig4piJuA9uQRMOXcODnQrLoXNc9s2In7lBFULwm0r7jmDMgftmdS0GVixPKGBSDBGfn0K+KuDWp8W/CBiwyI=".equals("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWyNxRk6l6VO38weHgfUSTJYrzCEWkhss8GEIPJm1k4ba4BIMvMkUtjRQhfaBYE8Zym+rkKCR4i+uG1g9QZLQsYkZn2sLNbVpfw32/kMQ32RlJ8OJCokyRMN99sQjApgOUfm2q8bxecz++gGkOB007n7Y0GAHSiBYAJ6TC0yWnUzV42PzPvGfXvl8vfdCwjwYIPLe9pFgYwenQQYDOrzxlsczwH5n2LMvtxoUz0H8NXHlnPeuoEYZK0s20wXPeKUzERU7qLB5utFAv2z1RDrk0Qdw/2wZL/5kHhPHY6NiEIIMpGA5cXybxEleIYiMnU1ZFm9IuPJh6EjLVjNMkOPhrAgMBAAECggEASPmxV3HlpiUQgTG8hg9abvTOiMzKF9R86/q5jeeFLjvnWKwmaWMlA+Sxh3vrbHU1qCY5ym57KDRfqwRSqQ/z+z8c4AqKGS4BfTN52orPzE+v449HkgRGlkZXA9f4anRuayG9JeyUxAl3IlW3gmiaQm8Lma68ww3FyBFntjrGkHH64oB77ZabwowmfYMhxpjls7e8WHuabLgalJ8thSovFWBrxIVEeeOTW1kkJLai+Z4CfGG1V/i18PndCHL0Ehlh5L/7smt0SI90YuERC7wpiepZz0AOhmZpAAmsYcbqF0yVWck/rb+xzfQudVqT1hfI3Ke+keXjdsBmIz5Ze7mJsQKBgQD8HgI04/WWA+/+DxNOwFTJUNhWBrCnYwYralpUtTk33gL+W+O4BFl1lKS9yom3al1vYh/DsmcxJFFa8Lbn3UYDW4FvIXG6GvOZx02Ju48vNjC72YkmLjvRwb+g2L3Sw3vUhlp6vbpctPV04xdTQn/SqPwc9QOnAgXbW/wad/5V7QKBgQCZG1coJPbdPytFCrUv+F+3kfJWDuU0Dos1qtUXf8oFHVuZvONNUEYAdsPeD1ubGSIp8jrTsxxD7d0zZ6jAv3OZO0scP+3pjI86mDnb9yYqTPBYB3Pv+vyewHqO6R9ijXeG7Ds7dXQoL4F/JgjUPzGRO3mR7F2PG+jKDjMCfZ48twKBgE5GFtNK7wVbRZhwH8N0bR5vjirvOstNMC4sf80K0q/oqq9D4ihQmWGq+5a9GhKq4EVjho8ghW85YlTEpVTJWyJRt5bEIGXyVi0pNoaLh8HVpj28JRuIgSP3bkJG6HBWJsztxYuT+hcsS4S1uJkt7Td/JX7sBu1D8IORRG0HUhxlAoGBAI0Z41L97fyssMXqPl09O4lEGeAxzg4RsT3+eHA1twrLqZWfvKON7VWUHqLR6IyhtxiNQqXDlbMMziUHzUAFsRVwzaH1UN9CSOWpUPllZmjpiz61b6Wk25e6r7hxJBmBYryXjWcYsbovPdreRJjGvHmqJDnVacvv3rQILf6HooM1AoGAFJmR0RvlWv4FjkrV3fwqBA/PLr+jf5+Einbuv5Lo2aV5AWgoKL4qjBcoYU5TK8Q0PFyZos+TlEs+wnZ0z3IONQwig4piJuA9uQRMOXcODnQrLoXNc9s2In7lBFULwm0r7jmDMgftmdS0GVixPKGBSDBGfn0K+KuDWp8W/CBiwyI="));
        long expiredDateTime = DateUtil.parseDateTime("2019-09-06 10:54:05").getTime();
        System.out.println(expiredDateTime);
    }

//    public static void testreturn() {
//        if (1 > 0) {
////            return;
//        }
//        System.out.println("hahahah");
//    }

}
