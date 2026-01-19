package com.nanhang;

import com.nanhang.Study01.Config.config;
import com.nanhang.Study01.Service.UserService;
import com.nanhang.Study01.Service.account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName Test001
 */
public class Test001 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(config.class);
        account account = applicationContext.getBean("account", account.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        account.login();
        account.logout();
        userService.transfer();
        userService.receivables();
    }
}
