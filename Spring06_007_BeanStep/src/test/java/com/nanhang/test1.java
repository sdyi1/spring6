package com.nanhang;

import com.nanhang.Bean.Study01.User;
import com.nanhang.Bean.study02.User2;
import com.nanhang.Bean.study03.User3;
import com.nanhang.Bean.study04.User4;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target 测试Bean的五步生命周期
 * @date 2025/11/18
 * @ClassName test1
 */
public class test1 {
    /*测试Bean的五步生命周期*/
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_01Application.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第四步:使用Bean"+user);
        /*执行自己配置的最后一部，销毁Bean的时候，需要我们先关闭Spring*/
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    /*测试Bean的七步生命周期*/
    @Test
    public void test02(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("Spring06_02Application.xml");
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println("第四步:使用Bean"+user2);
        /*执行自己配置的最后一部，销毁Bean的时候，需要我们先关闭Spring*/
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
    /*测试Bean的十步生命周期*/
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_03Application.xml");
        User3 user3 = applicationContext.getBean("user3", User3.class);
        System.out.println("第七步:使用Bean"+user3);
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
    /*测试将自己new的Bean交给Spring容器来管理*/
    @Test
    public void test04(){
        User4 user4 = new User4();
        System.out.println(user4);

        //将上面new 的对象放入SpringIOC容器，使用DefaultListableBeanFactory的registerSingleton方法 参数1:好比配置文件Bean标签的id属性，配置2：我们new的对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("User4Bean",user4);

        /*从Spring容器中获取*/
        User4 user4Bean = defaultListableBeanFactory.getBean("User4Bean", User4.class);
        System.out.println(user4Bean);

    }
}
