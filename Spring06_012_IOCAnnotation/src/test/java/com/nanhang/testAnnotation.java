package com.nanhang;

import com.nanhang.Study02.Bean.Vip;
import com.nanhang.Study02.Bean.order;
import com.nanhang.Study02.Bean.student;
import com.nanhang.Study02.Bean.user;
import com.nanhang.Study02.Bean02.user2;
import com.nanhang.Study04.user4;
import com.nanhang.Study05.Service.orderService;
import com.nanhang.Study06.Service.StudentService;
import com.nanhang.Study07.Comfig.Spring06_AnnotationConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/12
 * @ClassName testAnnotation
 */
public class testAnnotation {
    @Test
    public void test07(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring06_AnnotationConfig.class);
        com.nanhang.Study07.Service.StudentService studentService = annotationConfigApplicationContext.getBean("studentService", com.nanhang.Study07.Service.StudentService.class);
        studentService.inster();
    }

    @Test
    public void Test06(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_06Application.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.inster();
    }

    @Test
    public void test05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_05Application.xml");
        orderService orderService = applicationContext.getBean("orderService", orderService.class);
        orderService.inster();
    }
    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_04Application.xml");
        user4 user4 = applicationContext.getBean("user4", user4.class);
        System.out.println(user4.toString());
    }
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_03Application.xml");

    }
    @Test
    public void test02(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring06_02Application.xml");
        user userBean = applicationContext.getBean("userBean", user.class);
        order orderBean = applicationContext.getBean("orderBean", order.class);
        student studentBean = applicationContext.getBean("studentBean", student.class);
        Vip vip = applicationContext.getBean("vip", Vip.class);
        user2 user2 = applicationContext.getBean("user2", user2.class);


        System.out.println(userBean);
        System.out.println(orderBean);
        System.out.println(studentBean);
        System.out.println(vip);
        System.out.println(user2);
    }
}
