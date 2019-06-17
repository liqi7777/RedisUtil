package com.example.test;

import com.alibaba.fastjson.JSONObject;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @author Sky
 * create 2018/10/17
 * email sky.li@ixiaoshuidi.com
 **/
public class Person {
    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
