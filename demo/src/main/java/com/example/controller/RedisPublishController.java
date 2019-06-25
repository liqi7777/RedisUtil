package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sky
 * create 2019/06/17
 * email sky.li@ixiaoshuidi.com
 **/
@RestController
@RequestMapping("redis")
public class RedisPublishController {
    private int m = 0;

    @Autowired
    @Qualifier("stringRedisTemplate")
    private StringRedisTemplate template;

    @RequestMapping(value = "publish", method = {RequestMethod.POST, RequestMethod.GET})
    public String publish() {
        int index = m;
        for (int i = m; i < index + 10; i++) {
            template.convertAndSend("mytopic", "这是我发第" + i + "条的消息啊");
        }
        return "结束";
    }

    @RequestMapping(value = "testRedisQueueListener", method = {RequestMethod.POST, RequestMethod.GET})
    public String testRedisQueueListener(){
        int index = 0;
        for (int i = 0; i < 10; i++) {
            template.opsForList().leftPush("consumeQueue_test",String.valueOf(i));
        }
        return "结束";
    }
}
