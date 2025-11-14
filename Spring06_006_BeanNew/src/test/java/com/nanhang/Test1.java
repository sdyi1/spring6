package com.nanhang;

import com.nanhang.Bean.Study02.Star;
import com.nanhang.Bean.Study03.Fighter;
import com.nanhang.Bean.Study03.Gun;
import com.nanhang.Bean.Study04.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/11
 * @ClassName Test1
 */
public class Test1 {

    /*测试构造方法实例化*/
    @Test
    public void Study01Test(){
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
    }
    /*测试简单工厂模式*/
    @Test
    public void Study02Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study02_Application.xml");
        Star starM = applicationContext.getBean("getStar", Star.class);
        starM.say();
    }

    /*测试第三种方法，工厂方法模式*/
    @Test
    public void Study03Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study02_Application.xml");
        Fighter fighter = applicationContext.getBean("Fighter", Fighter.class);
        Gun gun = applicationContext.getBean("Gun", Gun.class);
        fighter.canDo();
        gun.canDo();
    }
    /*测试第四种方法，FactoryBean 最常用的之一！！！*/
    @Test
    public void Study04Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study03_Application.xml");
        Person person = applicationContext.getBean("Person", Person.class);
        person.Say();
    }

}
