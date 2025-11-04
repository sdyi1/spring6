package com.nanhang;

import com.nanhang.Bean.Set04.QianDaye;
import com.nanhang.Bean.Set05.SetList;
import com.nanhang.Bean.Set3.Student;
import com.nanhang.Bean.User;
import com.nanhang.Bean.User2;
import com.nanhang.Service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/29
 * @ClassName test1
 */
public class test1 {
    @Test
    //测试内外部注入
    public void inter(){
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring6_01Application.xml");
        OrderService orderUser = applicationContext.getBean("OrderUser", OrderService.class);
        orderUser.inster();
    }
    @Test
    //测试简单数据类型注入
    public void set02Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring6_02Application.xml");
        User user = applicationContext.getBean("User", User.class);
        String string = user.toString();
        System.out.println(string);
    }

    //测试有哪些简单数据类型
    @Test
    public void set03Test(){
    ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("Spring6_02Application.xml");
        User2 user2 = applicationContext.getBean("User2", User2.class);
        String string = user2.toString();
        System.out.println(string);
    }

    //测试Spring06_03Application.xml 级联注入
    @Test
    public void set04Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_03Application.xml");
        Student student = applicationContext.getBean("student", Student.class);
        String string = student.toString();
        System.out.println(string);
    }

    /*实验数组注入*/
    @Test
    public void set05Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_04Application.xml");
        //注入简单数据类型的对象
        QianDaye yuQian = applicationContext.getBean("YuQian", QianDaye.class);
        //注入简复杂数据类型的对象
        QianDaye yuQian2 =  applicationContext.getBean("YuQian", QianDaye.class);

        System.out.println(yuQian.toString());
        System.out.println(yuQian2.toString());
    }

    @Test
    public void Set05Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_05Application.xml");
        SetList setList = applicationContext.getBean("SetList", SetList.class);
        System.out.println(setList.toString());
    }
}
