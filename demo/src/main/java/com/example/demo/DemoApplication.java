package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.applicationListener.MyEvent;
import com.example.config.ymlListMapConfig.YmlListMapConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;
import org.springframework.retry.annotation.EnableRetry;

import javax.swing.*;

/**
 * @readme 本项目的所有接口采用json 协议，为运营平台提供后台接口。
 */
@SpringBootApplication
@ComponentScan("com.example")
@EnableRetry
//开启基于注解的缓存
@EnableCaching
//启动类加@EnableEncrypt注解，开启加解密自动配置  monkey-api-encrypt
//@EnableEncrypt

public class DemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
//		applicationContext.publishEvent(new MyEvent("测试事件"));
        Object ymlListMapConfig = applicationContext.getBean("quartzConfig");
        System.out.println("haha");
        System.out.println("spring版本号：" + SpringVersion.getVersion());
    }

}
