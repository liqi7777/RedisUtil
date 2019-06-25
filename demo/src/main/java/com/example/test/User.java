package com.example.test;

import java.math.BigDecimal;

/**
 * @author Sky
 * create 2018/11/06
 * email sky.li@ixiaoshuidi.com
 **/
public class User implements  Cloneable{
    private String username;
    private int money;
    private BigDecimal bigDecimal;

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public User() {
    }

    public User(String username, int money) {
        this.username = username;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", bigDecimal=" + bigDecimal +
                '}';
    }
}
