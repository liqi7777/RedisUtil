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
//        System.out.println("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlsjcUZOpelTt/MHh4H1EkyWK8whFpIbLPBhCDyZtZOG2uASDLzJFLY0UIX2gWBPGcpvq5CgkeIvrhtYPUGS0LGJGZ9rCzW1aX8N9v5DEN9kZSfDiQqJMkTDffbEIwKYDlH5tqvG8XnM/voBpDgdNO5+2NBgB0ogWACekwtMlp1M1eNj8z7xn175fL33QsI8GCDy3vaRYGMHp0EGAzq88ZbHM8B+Z9izL7caFM9B/DVx5Zz3rqBGGStLNtMFz3ilMxEVO6iwebrRQL9s9UQ65NEHcP9sGS/+ZB4Tx2OjYhCCDKRgOXF8m8RJXiGIjJ1NWRZvSLjyYehIy1YzTJDj4awIDAQAB".equals("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlsjcUZOpelTt/MHh4H1EkyWK8whFpIbLPBhCDyZtZOG2uASDLzJFLY0UIX2gWBPGcpvq5CgkeIvrhtYPUGS0LGJGZ9rCzW1aX8N9v5DEN9kZSfDiQqJMkTDffbEIwKYDlH5tqvG8XnM/voBpDgdNO5+2NBgB0ogWACekwtMlp1M1eNj8z7xn175fL33QsI8GCDy3vaRYGMHp0EGAzq88ZbHM8B+Z9izL7caFM9B/DVx5Zz3rqBGGStLNtMFz3ilMxEVO6iwebrRQL9s9UQ65NEHcP9sGS/+ZB4Tx2OjYhCCDKRgOXF8m8RJXiGIjJ1NWRZvSLjyYehIy1YzTJDj4awIDAQAB"));
//        System.out.println("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWyNxRk6l6VO38weHgfUSTJYrzCEWkhss8GEIPJm1k4ba4BIMvMkUtjRQhfaBYE8Zym+rkKCR4i+uG1g9QZLQsYkZn2sLNbVpfw32/kMQ32RlJ8OJCokyRMN99sQjApgOUfm2q8bxecz++gGkOB007n7Y0GAHSiBYAJ6TC0yWnUzV42PzPvGfXvl8vfdCwjwYIPLe9pFgYwenQQYDOrzxlsczwH5n2LMvtxoUz0H8NXHlnPeuoEYZK0s20wXPeKUzERU7qLB5utFAv2z1RDrk0Qdw/2wZL/5kHhPHY6NiEIIMpGA5cXybxEleIYiMnU1ZFm9IuPJh6EjLVjNMkOPhrAgMBAAECggEASPmxV3HlpiUQgTG8hg9abvTOiMzKF9R86/q5jeeFLjvnWKwmaWMlA+Sxh3vrbHU1qCY5ym57KDRfqwRSqQ/z+z8c4AqKGS4BfTN52orPzE+v449HkgRGlkZXA9f4anRuayG9JeyUxAl3IlW3gmiaQm8Lma68ww3FyBFntjrGkHH64oB77ZabwowmfYMhxpjls7e8WHuabLgalJ8thSovFWBrxIVEeeOTW1kkJLai+Z4CfGG1V/i18PndCHL0Ehlh5L/7smt0SI90YuERC7wpiepZz0AOhmZpAAmsYcbqF0yVWck/rb+xzfQudVqT1hfI3Ke+keXjdsBmIz5Ze7mJsQKBgQD8HgI04/WWA+/+DxNOwFTJUNhWBrCnYwYralpUtTk33gL+W+O4BFl1lKS9yom3al1vYh/DsmcxJFFa8Lbn3UYDW4FvIXG6GvOZx02Ju48vNjC72YkmLjvRwb+g2L3Sw3vUhlp6vbpctPV04xdTQn/SqPwc9QOnAgXbW/wad/5V7QKBgQCZG1coJPbdPytFCrUv+F+3kfJWDuU0Dos1qtUXf8oFHVuZvONNUEYAdsPeD1ubGSIp8jrTsxxD7d0zZ6jAv3OZO0scP+3pjI86mDnb9yYqTPBYB3Pv+vyewHqO6R9ijXeG7Ds7dXQoL4F/JgjUPzGRO3mR7F2PG+jKDjMCfZ48twKBgE5GFtNK7wVbRZhwH8N0bR5vjirvOstNMC4sf80K0q/oqq9D4ihQmWGq+5a9GhKq4EVjho8ghW85YlTEpVTJWyJRt5bEIGXyVi0pNoaLh8HVpj28JRuIgSP3bkJG6HBWJsztxYuT+hcsS4S1uJkt7Td/JX7sBu1D8IORRG0HUhxlAoGBAI0Z41L97fyssMXqPl09O4lEGeAxzg4RsT3+eHA1twrLqZWfvKON7VWUHqLR6IyhtxiNQqXDlbMMziUHzUAFsRVwzaH1UN9CSOWpUPllZmjpiz61b6Wk25e6r7hxJBmBYryXjWcYsbovPdreRJjGvHmqJDnVacvv3rQILf6HooM1AoGAFJmR0RvlWv4FjkrV3fwqBA/PLr+jf5+Einbuv5Lo2aV5AWgoKL4qjBcoYU5TK8Q0PFyZos+TlEs+wnZ0z3IONQwig4piJuA9uQRMOXcODnQrLoXNc9s2In7lBFULwm0r7jmDMgftmdS0GVixPKGBSDBGfn0K+KuDWp8W/CBiwyI=".equals("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCWyNxRk6l6VO38weHgfUSTJYrzCEWkhss8GEIPJm1k4ba4BIMvMkUtjRQhfaBYE8Zym+rkKCR4i+uG1g9QZLQsYkZn2sLNbVpfw32/kMQ32RlJ8OJCokyRMN99sQjApgOUfm2q8bxecz++gGkOB007n7Y0GAHSiBYAJ6TC0yWnUzV42PzPvGfXvl8vfdCwjwYIPLe9pFgYwenQQYDOrzxlsczwH5n2LMvtxoUz0H8NXHlnPeuoEYZK0s20wXPeKUzERU7qLB5utFAv2z1RDrk0Qdw/2wZL/5kHhPHY6NiEIIMpGA5cXybxEleIYiMnU1ZFm9IuPJh6EjLVjNMkOPhrAgMBAAECggEASPmxV3HlpiUQgTG8hg9abvTOiMzKF9R86/q5jeeFLjvnWKwmaWMlA+Sxh3vrbHU1qCY5ym57KDRfqwRSqQ/z+z8c4AqKGS4BfTN52orPzE+v449HkgRGlkZXA9f4anRuayG9JeyUxAl3IlW3gmiaQm8Lma68ww3FyBFntjrGkHH64oB77ZabwowmfYMhxpjls7e8WHuabLgalJ8thSovFWBrxIVEeeOTW1kkJLai+Z4CfGG1V/i18PndCHL0Ehlh5L/7smt0SI90YuERC7wpiepZz0AOhmZpAAmsYcbqF0yVWck/rb+xzfQudVqT1hfI3Ke+keXjdsBmIz5Ze7mJsQKBgQD8HgI04/WWA+/+DxNOwFTJUNhWBrCnYwYralpUtTk33gL+W+O4BFl1lKS9yom3al1vYh/DsmcxJFFa8Lbn3UYDW4FvIXG6GvOZx02Ju48vNjC72YkmLjvRwb+g2L3Sw3vUhlp6vbpctPV04xdTQn/SqPwc9QOnAgXbW/wad/5V7QKBgQCZG1coJPbdPytFCrUv+F+3kfJWDuU0Dos1qtUXf8oFHVuZvONNUEYAdsPeD1ubGSIp8jrTsxxD7d0zZ6jAv3OZO0scP+3pjI86mDnb9yYqTPBYB3Pv+vyewHqO6R9ijXeG7Ds7dXQoL4F/JgjUPzGRO3mR7F2PG+jKDjMCfZ48twKBgE5GFtNK7wVbRZhwH8N0bR5vjirvOstNMC4sf80K0q/oqq9D4ihQmWGq+5a9GhKq4EVjho8ghW85YlTEpVTJWyJRt5bEIGXyVi0pNoaLh8HVpj28JRuIgSP3bkJG6HBWJsztxYuT+hcsS4S1uJkt7Td/JX7sBu1D8IORRG0HUhxlAoGBAI0Z41L97fyssMXqPl09O4lEGeAxzg4RsT3+eHA1twrLqZWfvKON7VWUHqLR6IyhtxiNQqXDlbMMziUHzUAFsRVwzaH1UN9CSOWpUPllZmjpiz61b6Wk25e6r7hxJBmBYryXjWcYsbovPdreRJjGvHmqJDnVacvv3rQILf6HooM1AoGAFJmR0RvlWv4FjkrV3fwqBA/PLr+jf5+Einbuv5Lo2aV5AWgoKL4qjBcoYU5TK8Q0PFyZos+TlEs+wnZ0z3IONQwig4piJuA9uQRMOXcODnQrLoXNc9s2In7lBFULwm0r7jmDMgftmdS0GVixPKGBSDBGfn0K+KuDWp8W/CBiwyI="));
//        long expiredDateTime = DateUtil.parseDateTime("2019-09-06 10:54:05").getTime();
//        System.out.println(expiredDateTime);
//
//        System.out.println("\n" +
//                "{\\x22dataRequestBodyVO\\x22:{\\x22dt\\x22:{\\x22dataType\\x22:\\x224\\x22,\\x22factoryType\\x22:\\x22YD\\x22,\\x22houseCatalog\\x22:\\x220\\x22,\\x22roomId\\x22:\\x22958965\\x22,\\x22thirdHomeId\\x22:\\x225da55b74df6ab962431a6d3a\\x22,\\x22thirdRoomId\\x22:\\x225da55b75755c3e61f963d734\\x22,\\x22type\\x22:\\x220\\x22,\\x22userId\\x22:\\x2244270\\x22,\\x22uuid\\x22:\\x22null,89e9b5849184293ea6583cadec6ac11d,39a1ae3c6fad23f0f9ee258c2deb6058\\x22}},\\x22headerRequestDataVO\\x22:{\\x22bid\\x22:\\x22b001\\x22,\\x22cid\\x22:\\x22c1234\\x22,\\x22crt\\x22:\\x2220150102:040506\\x22,\\x22enc\\x22:\\x221.2.3\\x22,\\x22pid\\x22:\\x22validate_token\\x22,\\x22pvr\\x22:\\x221.0\\x22,\\x22rnd\\x22:\\x22s002\\x22,\\x22tkn\\x22:\\x22XXXXXX\\x22,\\x22utk\\x22:\\x22ABC\\x22,\\x22ver\\x22:\\x221.1.1\\x22}}".replaceAll("x22","").replaceAll("\\\\",""));
//
//        String[] split = "".split(",");
//        System.out.println(split.length);
//
//        Calendar instance = Calendar.getInstance();
//        instance.add(Calendar.MONTH,1);
//        System.out.println( DateUtil.formatDate(instance.getTime()));


//        List<User> userList = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            User user = new User();
//            user.setUsername("liqi");
//            user.setBigDecimal(BigDecimal.valueOf(i).multiply(BigDecimal.valueOf(10)));
//            userList.add(user);
//        }
//        long startTime = System.currentTimeMillis();
//        JSONObject.toJSONString(userList, SerializerFeature.DisableCircularReferenceDetect);
////        JSONObject.toJSONString(userList);
//        System.out.println("时间差:" + (System.currentTimeMillis() - startTime));

        ArrayList<String> list = Lists.newArrayList("水费", "电费", "水费");
        LinkedHashSet<String> collect = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect.toString());

        long startTime = System.currentTimeMillis();
        LOGGER.info("测试:{}", System.currentTimeMillis());



        String json="{\\x22deviceNos\\x22: [\\x228caa8435facf4b8f9af12c97cde718a4\\x22, \\x22424547c29e584aa2bb9faef15e641093\\x22, \\x226e39369e690d4f83b4f7a8374dd14273\\x22, \\x22d761f07457fb45bdbc70bf7e68caa4a1\\x22, \\x22f9cf553bb2704bf49bace1423fc87e2c\\x22, \\x2256f230191ca2463385852489b7230414\\x22, \\x22c95e631829624476a3e007370c9a2884\\x22, \\x22acc657823db2486c8973ec23d8b362ad\\x22, \\x22c66e63f6b6dc4de1bbb9069de44aa691\\x22, \\x22ced0777169db49ddaaa60da9fe7b37fc\\x22, \\x226acd0257bad040bfbd0ddbf6bf45e566\\x22, \\x22da758fe02af545289805b557051a1bba\\x22, \\x228934067833954b16939b4cf61e885f9c\\x22, \\x22a4754d3eb1894e36af94641d6f2fe1eb\\x22, \\x2238a933be2448452f91e0656326e498c3\\x22, \\x22243f111c21aa4cad8c15642ab397e0cf\\x22, \\x221d60841449404e7a8b7d981e4b5c4bcd\\x22, \\x22cfb672e0a3f1433db1efec7764148816\\x22, \\x228cb44c1c1dde451d81cd43663b171966\\x22, \\x22db74a0e8dc5f4163a02cd62398a35678\\x22, \\x2257de8d3f87894f8a91536d915c03667f\\x22, \\x22aff860c978ab4c69bbdfa849cc1176eb\\x22, \\x22f2560b737c594322a79fdf788ba280ba\\x22, \\x225dd7796bab214f1dbad3d23bb638e9c0\\x22, \\x2299ccc85f15ae4a35aff1a36220d5824c\\x22, \\x223b87e7264f9d4ba9b647eb0aa2938628\\x22, \\x22203b70cbedea4c0ab46b64ad53347edf\\x22, \\x22f546bad77c7c49f7b443fde72c576e07\\x22, \\x225ce4606e7399443687dc162b3e7bb182\\x22, \\x22ff78a841d6b345029aa58ca18ca8afc2\\x22, \\x224924ac22069a419a92c6c3bffcd5ca05\\x22, \\x22f242cd5566e147c380f6d67e0f809323\\x22, \\x221018c3d6d20c42ef96b8c24dde8fe264\\x22, \\x22e3c6246b93614e768ba5f036f3df5cf7\\x22, \\x226c4a05fcfb4249369d7ae7b160a9614a\\x22, \\x2245fe76d386354ce5afd4bc5edfb76636\\x22, \\x22bab8b22735e94ecabafd3456ca1084fc\\x22, \\x223f1ed94b0e204719b851760c724622e3\\x22, \\x22f283781873234e17a4e1d9cad7928c32\\x22, \\x223546deeca0dd4dcba6d6576183fa8a3c\\x22, \\x22380ca4356a6449b9a0808f32c9ae68d6\\x22, \\x22b739cebe1e484648b639a39cb9f91249\\x22, \\x22c62e1d97183544258c4c3ee55e1d372e\\x22, \\x2278d9000fc6c44ca1b1d54e877f2c8175\\x22, \\x225884493fd9e640028df57d0bda66b4b0\\x22, \\x2227e17a19c8264c5da7432ea6b8d2a509\\x22, \\x22dfd658e55e474f0cb4840f2ab076094c\\x22, \\x22c020a8a410fd420f9eb7a5060ded081f\\x22, \\x22648cf266acd84472bad1acfd5e1d09a2\\x22, \\x22e124225cbecd422489c8b973c3f75554\\x22, \\x2206d0f03610164a69a472ee713b8d2e2a\\x22, \\x22392908499d81477d994f324de21ce0e5\\x22, \\x2206ab82225e5b4c5083b6dc86a1781b41\\x22, \\x22f58f2bed10eb4f3290ab998ba4208631\\x22, \\x22d92c9e15af88487eb9a9b18e2c2367da\\x22, \\x220474c508178d4c78837363bb245a0c7b\\x22, \\x225209f27071d3453987dbb71f486ea47b\\x22, \\x2223fad351c7b24c75a199deb195007e7e\\x22, \\x2245a15ea6ba7846cd97e6866f19f4a6a3\\x22, \\x22b7e3543b7dc74174bbdd29efe8aac209\\x22, \\x22fe05783f56194dca8b44e9f081f7877d\\x22, \\x22afae820542d44daea20a8ab2bf9d9936\\x22, \\x220df518a3215d4a6e91322d6ae53b97a3\\x22, \\x22de185153878948228a3ab1b70fb16f7f\\x22, \\x225d0ae1e25a35498eab849b8f8e64d1c9\\x22, \\x2231b407e448274eecbea27768aeef0752\\x22, \\x222d9048e6bd42461e9b1591402f57bbed\\x22, \\x22b0ccc0374c734f38896e53aaea04b19a\\x22, \\x22f916c4b8aa1948639ca20b968437d0b9\\x22, \\x22e805ceadff3e461db6db742c056d60a0\\x22, \\x226bdf77e2ff4e4c29b933a8ef2c69f0af\\x22, \\x22c26711fa4468431db1b084d73b0fb5b2\\x22, \\x22044acc34e2054bc7a587f3e0e80b0e24\\x22, \\x22321bbf2fe66e43679d2935e2f99ab924\\x22, \\x224b9d8d201cc24406a3a6292d63c1992b\\x22, \\x2223595288023b49b095bcf50c8445560a\\x22, \\x22876f50e035ba4ace85249c402a995608\\x22, \\x220f8e5a69cd3644e4a2c6e99e3db64e4b\\x22, \\x22f90a337b9e2447c2b0820ae2f63ef653\\x22, \\x22423a8ef7082147c698aa2faf13790e24\\x22, \\x22cb04b2fa4e31489ebca63f36411be419\\x22, \\x2280f05b3a78084387bbf48f6438776af8\\x22, \\x22c3579779c11d4db8a08473ede74e1188\\x22, \\x222e665c8195a0405f83ffd6277b7ec380\\x22, \\x225b3653e3f60549ef804f3545ca944599\\x22, \\x2228094b7001864e21bae4c3053b2edb22\\x22, \\x2219f025c303a44a3d95ec259f35f7a936\\x22, \\x222fc87dc880e546bda7e4a4126c3edcf2\\x22, \\x228ce2571a88d346d1bac2a5092aa6519c\\x22, \\x229d113f32b4ae4eeb96697c8c9794e805\\x22, \\x223253c053f1e8442c803e161ef28a4ab0\\x22, \\x222a75dae36d3f4cf3be9d474e6e6b600e\\x22, \\x2220b5123de465457cbd9eb23147a48a31\\x22, \\x22f818099db4194a88851a5e5cf8e0bb21\\x22, \\x22c158c354dc7f4bd6838c16a742a7c479\\x22, \\x229a023698aafa4c329c9cbf55fd33baf2\\x22, \\x22da0effd4dda74181b13cd073e67c988c\\x22, \\x2287eca44e7d7c4f789f015388438e470c\\x22, \\x2249aef5d7b5054e3c99b526710ac82285\\x22, \\x228680724e4b764c3fb37bce339ea4ccea\\x22, \\x223f4b8441c16e41319a7849ea1fe04f27\\x22, \\x222470940e0fe940bf8a608532de338306\\x22, \\x22a23b20289505492a85027d301f7ff337\\x22, \\x22f27ad6ce8daf4d1fbea0f2713777b603\\x22, \\x22b8964191ea6440c5a8cbe61556efbbe2\\x22, \\x226000d4785ed84d2a8a18b7c1337b689b\\x22, \\x22783e1b10007748088e793bbe517b5125\\x22, \\x22a5afcb4f4e1346d0990b6c4031083611\\x22, \\x221d7ce7bc96d94380871ec3b3bf334468\\x22, \\x22c152bdd14c3640b8817873181a0a4a89\\x22, \\x221fe785f11a37421fa4016a9e219ec888\\x22, \\x2214630de563204e1a9848dabe9637f4cd\\x22, \\x225cbcb39f682847bd81d7635415d4ce2e\\x22, \\x22afaf3598989a4f718baddf4c03560cb0\\x22, \\x226efaa74421b84609a4ef95fe5b9a6353\\x22, \\x222057cdedec4d4af6a339faadfa1b7e55\\x22, \\x22313bb1b47cbe47878325910d090686a5\\x22, \\x221d07310964f54a75aa6cea9352d43a6b\\x22, \\x22b6e8586f79004ea4b1c7963967e8988d\\x22, \\x22f68462aaafb843f58ce2bdda5b67988f\\x22, \\x2263f097c904884edcb315507be1a9c75c\\x22, \\x22f8b2348105404faba996afc8ea1906a4\\x22, \\x22581658e5fbd049fbb495cda3a9b180c1\\x22, \\x2237dfbbe3f01748fe88464e7d83156902\\x22, \\x226c616a9953184e698a2f4285150e3970\\x22, \\x22f6a32586334040e29ef7ad0b71aa38d5\\x22, \\x2266b26e66ce2f43e28728f2c293aacc79\\x22, \\x2262f6bc711241427888296245b984c9ee\\x22, \\x223eb8119fcda84e55835eecf11b3501e3\\x22, \\x225d3d99cf9d5c48a8b2b340a1ceeded70\\x22, \\x223012e06ab300491d9645cd4c1922bd6b\\x22, \\x22334bf882364a42e6b7af7eb5a5492cc9\\x22, \\x22b4b79dd92bb14b4eb1a9bed46484275b\\x22, \\x229d5a4779c8ef4199b7ac1fcb49e9c9b8\\x22, \\x2212381c125d264eefa3b00f92c44626a3\\x22, \\x22c146050bbd9f4275b96301e365b8a431\\x22, \\x2274d6677a03be45258b5b85b76c48f5ca\\x22, \\x225ede39bfa8b84790b72a29e11bb66820\\x22, \\x2235fd97fd4f264a6090b7226e1454c7de\\x22, \\x22ae3a3528b17c4d80859aaddab261db15\\x22, \\x224794cbd60f9e4b749a7e2fc4c751d7da\\x22, \\x22fe3835617d0b4f00970a7b0e03a3afbd\\x22, \\x22e160fa11942f4f3e8d95af30e6c9204e\\x22, \\x228debc15fde7a4132acd9f99859d422af\\x22, \\x22cdca113283cf4c598f5fe2dab1389036\\x22, \\x225a26fb3a08e34f77a734c30d9aaf4ebf\\x22, \\x22a9d841bebace476d82e87bd92a35a8e7\\x22, \\x22844d5ccb054746cd900cafee4e486ee1\\x22, \\x22bd42d19ad06c4fc3a47bc01f22e505e4\\x22, \\x227c6c90891c1948269e23531200f8f849\\x22, \\x229413fbce19dc4b438c5deb8fd9b70e69\\x22, \\x2261378b9697d8439598ace86878832f1d\\x22, \\x229cc9b4577dbc4fa1b5a8898227d83ba6\\x22, \\x22b30c92c8392645b4926553a3e4a4c408\\x22, \\x2293c13846d979440d88cd1522c9085fdd\\x22, \\x22220deb9e494c4d8f8c62695f619e2ae1\\x22, \\x2276037b51065e483da266a17515b6389d\\x22, \\x226167a26f7f1b4c46ab0bb1e3e03899bf\\x22, \\x22c4aa69de7d8346f28b689f9bb463b797\\x22, \\x228919d25d3e9e4e2c90f9801cd21babb5\\x22, \\x2297863c18458a43bba2d02553f96324bb\\x22, \\x2279d776ef4e94481b866eb2f6516adcda\\x22, \\x228b1fa566731d4621b94fd25a253b2579\\x22, \\x2264369309254a41899e36a7ed0a3b4caa\\x22, \\x2215acf5d4e8104d818114979a38b5aed0\\x22, \\x22eac284a396cb4c93a2080568177d881a\\x22, \\x224ca98ccfacec42708f774e1667090ad7\\x22, \\x22a64b492dfa0544d383f07e8c56735cd8\\x22, \\x2231399c49ff52435d8be87b8ff1d3141a\\x22, \\x223d307428e3f1428c9b06e5fbbb2c890a\\x22, \\x227bc13ad9c40e41a28dba4780baef57c9\\x22, \\x22b7055b12399e4324bf9895f4e8467c34\\x22, \\x22a95f900d1d744fbb9289a536d620131d\\x22, \\x225e91ec009fae4bfea438ebcc87955db1\\x22, \\x2237e9e1166f114625ab0ef77b3b947d07\\x22, \\x22e00ae4a9ab0d44e69bb5ddb578f04e1f\\x22, \\x22c16be026f2e84cc3ae4286ad8031fce5\\x22, \\x2284a85798573b489bb1b01b444d29e2b1\\x22, \\x2282165416ffd446868c0cfb0e8b6fecc2\\x22, \\x224e123e6fa23145269e4975342fb7fa3a\\x22, \\x22c4fe7cd3eea04589bd067a4c50d387cf\\x22, \\x223a6c9061c0c3485d8122009713a6cb43\\x22, \\x225a8caf6ff06148adada05582da79d782\\x22, \\x226b501a26275645c48597027ec367b9e4\\x22, \\x22079f16d929f546d3a4c01eae431e851c\\x22, \\x22a515b789fe3b4b4eb5babf67290b2aad\\x22, \\x22c98f1ee8989840c989a7105372407883\\x22, \\x22683e599a2b5a41648753f840707d31f0\\x22, \\x227cd8a9a84d284a1db8a691a8d23dffe9\\x22, \\x22f570a7264eba41438842a5d4d409584d\\x22, \\x22ee0bcf8c59234797894a2dbd490d5d02\\x22, \\x22e43b09f0466448f9941bbca674db3333\\x22, \\x22f17d9504bfbd4f42bded6719561b400c\\x22, \\x22dbfb1f314fec420887d57d8d54d15400\\x22, \\x221a0dacadfb094beab2c54ba524bbbb03\\x22, \\x22826ba130247d4d05a5618bfa0260143a\\x22, \\x22cd88223fda42474ca8313f4fc6883e31\\x22, \\x228077ba5204164922aac14b53024269bc\\x22, \\x2264f3f8525c3f406a91120503e62d485d\\x22, \\x2250e039820b0a4ed0ba1880e261a4fe32\\x22, \\x22023e35221aa849f29d75d6166599667c\\x22, \\x225ee3db0242374ec89ce66be2079c683b\\x22, \\x227c642bed71654cac90b4701decbe8475\\x22, \\x2297118c5cc68c40b6957c114da91175cc\\x22, \\x22411bf1fcd08d43cb95ea886867b84372\\x22, \\x22e782c2194aff4d2a90daa19a9ff1e3d4\\x22, \\x22b06fe1aae5c74863a043b9006c7becfb\\x22, \\x22fb5c00d0545f49aa9ff7ef53d6b04e23\\x22, \\x22e1952413e3c74212bdb3d6081922adb6\\x22, \\x22a9223757514343b4a3fb0f2fda4e2db2\\x22, \\x22067dc44aab5a48a19839365be03f39d7\\x22, \\x226f5c7e15f9594f3db0fc00f11c53a6bd\\x22, \\x22e4a4a989b0b24fba92d83342d544d405\\x22, \\x229bc725afcc494e9a9b47ceeff61b8586\\x22, \\x2255171b7515d345c1be81271c11fb513d\\x22, \\x22587d50c5d9124dc2a90fce87900c845a\\x22, \\x22364cbb72cad0401182b4497416afa639\\x22, \\x225c824402d7ac4c9381bb97c5c2915fda\\x22, \\x22be801aee49b64e03afd738d1b0885110\\x22, \\x22dd3b71a2b9b841eea75be272c7a20564\\x22, \\x22c9a0e854c9db4667844ec254103ceeda\\x22, \\x225e433280994940969551c8fa62466e76\\x22, \\x22891dda8188fa4add806019008176e0b0\\x22, \\x22663c43a146204ba5a7c7b7eadf077188\\x22, \\x22663c43a146204ba5a7c7b7eadf077188\\x22, \\x226852b216185b439a9b193ca0e7781fc8\\x22, \\x222d1cabf6085b4136908efcfbc817cbcb\\x22, \\x221cfc1043e1c942fd922bc5ba5dbeab95\\x22, \\x22d1cbca6f33b44a7a88f1fab49cb67643\\x22, \\x226e8cd928588347ca8ff107c7208b9f5c\\x22, \\x2227c063d92a8b460bb27e05a8e093771d\\x22, \\x22af53843da27d47159658bca390cd0ce9\\x22, \\x2290da03b56fea4bb9882c88a2b7deac3e\\x22, \\x229c83e6adac4845208aec1a8e3bc65f84\\x22, \\x2258b591798dda457cb7a2ee36a3b4a568\\x22, \\x227f5a6b1d8af34249bc015350715e235e\\x22, \\x2205d2b7807714450e83a45a37c3c7f60d\\x22, \\x22108a7faf58854ef9980d7f5ae062a6d3\\x22, \\x22dd0f90b661dd4b2cbf27330e8189356d\\x22, \\x220f2ae815ef324e7997634ca03193a116\\x22, \\x22ad0550d115bf49049799495c2ed0fa96\\x22, \\x22a04aa9a6537f4236b9032edb963527d7\\x22, \\x22e00910da1f884ee3a6741afe1fb29f2d\\x22, \\x22250c44a57740403395ee0f9eb3629bb3\\x22, \\x22533ab9b8b5ea434c8106647cdc8e6516\\x22, \\x22c1952dc017484db5a6acad6851d94570\\x22, \\x22441e4f6098c54f879c163cd2005a9160\\x22, \\x226b644143b3e142df95f37b0746b5f4a3\\x22, \\x22e83707a444ac48179abbee603456ccbf\\x22, \\x22b1d86266cf494ab0808907fcc1604c84\\x22, \\x226db9f62680a1475faea54b63fd984e01\\x22, \\x22da1d681b93c5431593f615552a5c6bc2\\x22]}";
        json=json.replaceAll("\\\\x22","\"");
//        JSONObject.parseObject(json);
        System.out.println(json);
        System.out.println(Long.toOctalString(341226199603105552L));


        String s="{\"meterReading\":1549420.0}";
        Double meterReading = JSONObject.parseObject(s).getDouble("meterReading");
        double v = new BigDecimal("0.001").multiply(new BigDecimal("1549420.0")).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(v);


    }

//    public static void testreturn() {
//        if (1 > 0) {
////            return;
//        }
//        System.out.println("hahahah");
//    }


}
