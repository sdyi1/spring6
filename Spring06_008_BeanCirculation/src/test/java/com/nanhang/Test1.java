package com.nanhang;

import com.nanhang.Bean.Study01.Husband;
import com.nanhang.Bean.Study01.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/24
 * @ClassName Test1
 */
public class Test1 {

    /*测试set注入单例多例的循环依赖Bean的实例化*/
    @Test
    public void Test01(){
        /*测试单例*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_01_Application.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(husband);
        System.out.println(wife);

        /*测试多例*/
        Husband husband1 = applicationContext.getBean("husband1", Husband.class);
        Wife wife1 = applicationContext.getBean("wife1", Wife.class);
        System.out.println(husband1);
        System.out.println(wife1);
    }
    /*测试构造注入单例多例的循环依赖Bean的实例化*/
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_02_Application.sml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);
    }
}
