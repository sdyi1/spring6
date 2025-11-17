package com.nanhang.TestBag;

import com.nanhang.Bean.CGB_01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/15
 * @ClassName Test1
 */
public class Test1 {


@Test
    public void CGB01Test(){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CGB_001_Application.xml");
    User user = applicationContext.getBean("user", User.class);
    User user1 = applicationContext.getBean("userByFactory", User.class);

    System.out.println(user.toString());
    System.out.println(user1.toString());
}
/*尝试利用构造工厂注入Data属性到User对象种*/
    @Test
    public void CGB01_2Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CGB_001_Application.xml");
        User user = applicationContext.getBean("User2", User.class);
        System.out.println(user.toString());
    }

    /*突发奇想，不适用Data工厂，而是直接一步到位，使用User工厂，在里面注入
    *
    * 总结：仔细想想，这样子如果其他对象需要使用Data就无法重复使用，
    *       所以创建工厂的时候最好遵守一个工厂一个对象的原则，（一个工厂就一个new)*/
    @Test
    public void CGB1_3Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CGB_001_Application.xml");
        User user = applicationContext.getBean("User3", User.class);
        System.out.println(user.toString());
    }
}
