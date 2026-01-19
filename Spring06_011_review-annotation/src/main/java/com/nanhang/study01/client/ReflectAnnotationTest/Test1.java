package com.nanhang.study01.client.ReflectAnnotationTest;

import com.nanhang.study01.Bean.User;
import com.nanhang.study01.Component;

import java.lang.reflect.Constructor;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/9
 * @ClassName Test1
 */
public class Test1 {
    public static void main(String[] args) {
        //复习通过反射机制怎么读取注解

        try {
            //首先获取我们使用了这个注解的类对象
            Class<?> aClass = Class.forName("com.nanhang.study01.Bean.User");

            //判断这个类对象是否使用了Component这个注解
            if (aClass.isAnnotationPresent(Component.class)) {
                //如果有使用整个注解，使用反射获取
                Component annotation = aClass.getAnnotation(Component.class);
                //我们可以访问整个类上面注解的属性
                String value = annotation.value();
                System.out.println(value);



            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
