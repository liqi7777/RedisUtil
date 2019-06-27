package com.example.test;


import java.math.BigDecimal;
import java.util.*;

/**
 * @author Sky
 * create 2018/12/14
 * email sky.li@ixiaoshuidi.com
 **/
public class HutoolTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(0, "c");
        System.out.println(list.toString());
        StringBuffer sb = new StringBuffer("hahahha");
        String s1 = null;
        String s2 = null;
        sb.append(s1).append(s2);
        System.out.println(sb.toString());

        Map<String, String> map = new HashMap<>();
        map.put(null, "ahh");
        map.put("hee", "aha");
        System.out.println(String.valueOf((int) ((Math.random() * 9 + 1) * 100000)));
        System.out.println("hah".equals(null));
    }
}
