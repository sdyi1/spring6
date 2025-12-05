package org.myspringframwork;

import org.junit.Test;
import org.myspringframwork.core.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/4
 * @ClassName test01
 */
public class test01 {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("mySpring_Application.xml");
        Object user = classPathXmlApplicationContext.getBean("user");
        System.out.println(user.toString());

    }
}
