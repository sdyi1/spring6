package com.nanhang.Bean.study03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/19
 * @ClassName User3
 */
public class User3 implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, InitializingBean,DisposableBean {

    private String name;

    public User3() {
        System.out.println("第一步，实例化Bean");
    }

    public void setName(String name) {
        System.out.println("第二部，给Bean赋值");
        this.name = name;
    }

    /*初始化Bean需要我们再配置文件种通过 init-method="方法名" 配置*/
    public void initBean (){
        System.out.println("第五步，初始化Bean");
    }
    /*销毁Bean需要我们再配置文件种通过 destroy-method="方法名" 配置*/
    public void deleteBean(){
        System.out.println("第八步，销毁Bean");
    }

    /*这个方法是BeanClassLoaderAware接口的实现方法，用于获取类加载器*/
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("第三步检查是否实现了Aware相关接口（类加载器）"+classLoader);
    }
/*这个方法是BeanFactoryAware接口的实现方法，用于获取生成对象的BeanFactory对象*/
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("第三步检查是否实现了Aware相关接口（BeanFactory对象）"+beanFactory);
    }
/*这个方法是BeanNameAware接口的实现方法，用于获取对象的名称*/
    @Override
    public void setBeanName(String name) {
        System.out.println("第三步:检查是否实现了Aware相关接口（对象名称）"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean接口调用了afterPropertiesSet方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean接口调用了destroy方法");
    }
}
