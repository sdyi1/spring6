package com.nanhang;

import com.nanhang.Study01.Service.accountService;
import com.nanhang.Study04.Pojo.user;
import com.nanhang.Study04.Service.Impl.accountServiceImpl;
import com.nanhang.Study07.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/15
 * @ClassName test001
 */
public class test001 {
    //添加代码，添加过程中等待了 20秒，这个时候数据没有提交到数据库，而是在捏存在
    @Test
    public void test07_1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_07_Application.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        com.nanhang.Study07.Pojo.user user1 = new com.nanhang.Study07.Pojo.user("act-005",1000.0);
        userService.save(user1);
        System.out.println("保存完成");
    }
    //在test07_1等待的过程中执行了这个
    //当Transactional 的隔离级别设置为1的时候，我们可以读取到正在添加的 act-005这个数据，说明是从内存总读取到的
    @Test
    public void test07_2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_07_Application.xml");
        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        com.nanhang.Study07.Pojo.user select = userService.select("act-005");
        System.out.println(select.getActno());
    }
    @Test
    public void test05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_05_Application.xml");
        com.nanhang.Study05.Service.accountService accountService = applicationContext.getBean("accountService", com.nanhang.Study05.Service.accountService.class);
        com.nanhang.Study05.Pojo.user user = new com.nanhang.Study05.Pojo.user("act-004",1000.0);
        accountService.save(user);

    }

    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_04_Application.xml");
        com.nanhang.Study04.Service.accountService accountService = applicationContext.getBean("accountService", com.nanhang.Study04.Service.accountService.class);
        user user1 = new user("act-004",1000.0);
        accountService.save(user1);

    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_02_Application.xml");
        com.nanhang.Study02.Service.accountService accountService = applicationContext.getBean("accountService", com.nanhang.Study02.Service.accountService.class);
        accountService.transfer("act-001","act-002",10000.0);
    }
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_01_Application.xml");
        accountService accountService = applicationContext.getBean("accountService", accountService.class);
        accountService.transfer("act-001","act-002",10000.0);
    }
}
