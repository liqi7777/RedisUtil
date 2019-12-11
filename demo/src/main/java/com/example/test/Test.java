package com.example.test;

import cn.hutool.core.date.DateUtil;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class Test {
    public static class Inner {

        public final static Test testInstance = new Test(3);

        static {
            System.out.println("TestInner Static!");
        }
    }

    public static Test getInstance() {
        return Inner.testInstance;
    }

    public Test(int i) {
        System.out.println("Test " + i + " Construct! ");
    }

    static {
        System.out.println("Test Stataic");
    }

    public static Test testOut = new Test(1);

    public static void main(String args[]) throws InterruptedException {

        List<String> list = null;
        Optional.ofNullable(list).get();
    }
}
