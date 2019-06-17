package com.example.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class Test {
    public static class Inner{

        public final static Test testInstance = new Test(3);

        static {
            System.out.println("TestInner Static!");
        }
    }

    public static Test getInstance(){
        return Inner.testInstance;
    }

    public Test(int i ) {
        System.out.println("Test " + i +" Construct! ");
    }

    static {
        System.out.println("Test Stataic");
    }

    public static Test testOut = new Test(1);

    public static void main(String args[]){
        Person p =new Person(1,"liqi");

        Map<String,Object> map=new HashMap<>();
        map.put("a",p);
        System.out.println((Person)map.get("a"));
    }
}
