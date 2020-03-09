package com.example.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import net.bytebuddy.asm.Advice;

import java.math.BigDecimal;

/**
 * @author Sky
 * create 2018/11/06
 * email sky.li@ixiaoshuidi.com
 **/
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable {
    private String username;
    private int money;
    private BigDecimal bigDecimal;





    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", bigDecimal=" + bigDecimal +
                '}';
    }
}
