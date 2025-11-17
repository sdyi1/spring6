package com.nanhang.Bean.CGB_01;


import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author 徐
 * @version 1.0
 * @target 实践FactoryBean 注入Data
 * @date 2025/11/15
 * @ClassName User
 */
public class User {

    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "birth=" + birth +
                '}';
    }
}
