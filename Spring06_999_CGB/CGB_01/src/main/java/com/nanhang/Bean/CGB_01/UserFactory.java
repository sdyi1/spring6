package com.nanhang.Bean.CGB_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/15
 * @ClassName UserFactory
 */
public class UserFactory implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
