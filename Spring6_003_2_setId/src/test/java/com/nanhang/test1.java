package com.nanhang;

import com.nanhang.Bean.Set04.QianDaye;
import com.nanhang.Bean.Set05.SetList;
import com.nanhang.Bean.Set06.cat;
import com.nanhang.Bean.Set06.math;
import com.nanhang.Bean.Set07.MapUtil;
import com.nanhang.Bean.Set07.MapUtil2;
import com.nanhang.Bean.Set09.MyDataSource;
import com.nanhang.Bean.Set3.Student;
import com.nanhang.Bean.User;
import com.nanhang.Bean.User2;
import com.nanhang.Bean.set08.OrderDao;
import com.nanhang.Bean.set08.UserService;
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

    /*实验集合注入*/
    @Test
    public void Set05Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_05Application.xml");
        SetList setList = applicationContext.getBean("SetList", SetList.class);
        System.out.println(setList.toString());
    }

    /*实验 null 空字符串 特殊字符注入*/
    @Test
    public void Set06Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_06Application.xml");
        cat cat = applicationContext.getBean("cat", cat.class);
        System.out.println(cat.toString());
        /*测试注入特殊字符串*/
        math math1 = applicationContext.getBean("math", math.class);
        System.out.println(math1.toString());
    }
    /*测试p命名空间注入*/
    @Test
    public void Set07Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_07Application.xml");
        //测试p命名空间注入
        com.nanhang.Bean.Set07.cat cat = applicationContext.getBean("cats", com.nanhang.Bean.Set07.cat.class);
        System.out.println("p命名空间注入测试结果"+cat.toString());
        /*测试c命名空间注入*/
        com.nanhang.Bean.Set07.cat cat1 = applicationContext.getBean("cats2", com.nanhang.Bean.Set07.cat.class);
        System.out.println("c命名空间注入测试结果"+cat1.toString());
        /*测试util命名空间注入*/
        MapUtil maputil = applicationContext.getBean("maputil", MapUtil.class);
        MapUtil2 maputil2 = applicationContext.getBean("maputil2", MapUtil2.class);
        System.out.println("util命名空间注入Bean1注入测试结果"+maputil.toString());
        System.out.println("util命名空间注入Bean2注入d测试结果"+maputil2.toString());


    }

    /*测试xml根据名称自动装配，根据数据类型自动装配*/
    @Test
    public void set08Test(){
        /*测试xml根据名称自动装配*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_08Application.xml");
        UserService userService = applicationContext.getBean("UserService1", UserService.class);
        userService.inster();

        /*测试xml根据数据类型自动装配*/
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("Spring06_08_02Application.xml");
        OrderDao orderDao = applicationContext1.getBean("orderDao", OrderDao.class);
        orderDao.inster();
    }

    /*测试获取外部配置*/
    @Test
    public void set09Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_09Application.xml");
        MyDataSource myDataSource = applicationContext.getBean("MyDataSource", MyDataSource.class);
        System.out.println(myDataSource.toString());
    }
}
