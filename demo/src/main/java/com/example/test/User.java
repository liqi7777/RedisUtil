package com.example.test;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author Sky
 * create 2018/11/06
 * email sky.li@ixiaoshuidi.com
 **/
@Data
@Accessors(chain = true)
public class User implements Cloneable {
    private String username;
    private int money;
    private BigDecimal bigDecimal;

}
