package com.nanhang.Bean.study02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/19
 * @ClassName BeanPost
 */
public class BeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：Before方法执行");

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步:After方法执行");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
