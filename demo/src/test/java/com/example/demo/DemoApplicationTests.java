package com.example.demo;

import com.example.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.naming.Name;
import javax.sound.midi.Soundbank;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test01() throws Exception {
//        System.out.println(redisUtil.randomKey());
//        redisUtil.set("a","nishishui");
//        System.out.println(redisUtil.get("a"));
//        System.out.println(redisUtil.getAndSet("a","aaa"));
        redisUtil.hPut("bhash", "b", "wuwuwu");
        System.out.println(redisUtil.hExists("bhash", "b"));
        System.out.println(redisUtil.hValues("bhash"));
        System.out.println(redisUtil.expire("bhash", 2000, TimeUnit.SECONDS));

    }

}
