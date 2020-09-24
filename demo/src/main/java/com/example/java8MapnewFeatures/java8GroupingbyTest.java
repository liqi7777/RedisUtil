package com.example.java8MapnewFeatures;


import com.example.test.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sky
 * create  2020-09-23 16:18
 * email sky.li@ixiaoshuidi.com
 */
public class java8GroupingbyTest {

    public static void main(String[] args) {
        User user1 = new User("zhangsan", 10, BigDecimal.valueOf(10));
        User user2 = new User("zhangsan", 20, BigDecimal.valueOf(20));
        User user3 = new User("lisi", 30, BigDecimal.valueOf(30));
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Map<String, Map<Integer, List<User>>> collect = list.stream().collect(
                Collectors.groupingBy(
                        User::getUsername, Collectors.groupingBy(User::getMoney)
                )
        );
        System.out.println(collect);


    }
}
