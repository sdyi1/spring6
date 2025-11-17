package com.nanhang.Bean.CGB_01;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/17
 * @ClassName UserFactory02
 */
public class UserFactory02 implements FactoryBean<User> {
    private String Dataget;

    public void setDataget(String dataget) {
        Dataget = dataget;
    }

    @Override
    public User getObject() throws Exception {
        User user = new User();
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(Dataget);
        user.setBirth(parse);
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
