package com.nanhang;

import com.nanhang.Study01.Service.UserService;
import com.nanhang.Study03.Config.config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/5
 * @ClassName test001
 */
public class test001 {
    @Test
    public void test03(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(config.class);
        com.nanhang.Study03.UserService.UserService userService = applicationContext.getBean("userService", com.nanhang.Study03.UserService.UserService.class);
        userService.show();
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study02_Application.xml");
        com.nanhang.Study02.Service.UserService userService = applicationContext.getBean("userService", com.nanhang.Study02.Service.UserService.class);
        userService.show();
    }

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.show();
    }



}
