package com.nanhang.Bean.Study04;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/14
 * @ClassName PersonFactory
 */
public class PersonFactory implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /*这个方法默认实现，默认返回true 标识返回的对象是单例的*/
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
