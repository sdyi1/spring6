package com.nanhang;

import com.nanhang.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/27
 * @ClassName Test
 */
public class Test {
    private static final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanApplication.xml");

    @org.junit.Test
    public void testUserService1(){
        UserService userServiceId = applicationContext.getBean("UserServiceId", UserService.class);
            userServiceId.intoTest();


    }
}
