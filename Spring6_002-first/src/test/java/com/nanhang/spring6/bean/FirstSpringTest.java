package com.nanhang.spring6.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/23
 * @ClassName FirstSpringTest
 */
public class FirstSpringTest {
    @Test
    public void testFirstSpring(){
        //我们需要获取spring容器对象，再使用容器对象根据id获取我们再配置文件中配饰好的Bean

        /*首先创建Spring容器对象*/
        /*
        * ApplicationContext解释:
        *           直译为：应用上下文
        *       ApplicationContext：是一个接口，有很多实现类，其中有一个叫做 ClassPathXmlApplicationContext
        *       ClassPathXmlApplicationContext 是一个专门根据传入从路径中加载Spring配置文件的一个对象
        * */
// -------------------------------------------------------------------------------------------------------------------------
        /*我们这里可以直接写配置文件的名字，是因为resources是路径的根路径，
        * 思考:为什么resources是类的根路径，我还没有理解什么是类路径*/
// -------------------------------------------------------------------------------------------------------------------------

    /*这行代码只要执行，就会启动Spring容器，解析Spring.xml配置文件，并且实例化所有的Bean对象放入容器*/
        /*一个容器对象可以一次配置多个配置文件*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring6First.xml","Spring6Seconed.xml");

      /*根基Beanid从Spring容器对象中获取这个Bean对象*/
        Object userBean = applicationContext.getBean("UserBean");
        Object vidUser = applicationContext.getBean("VidUser");

//        同上
        /*注意Bean类中如果写了有参构造我们就需要手动补充无参构造，否则会报错没有无参构造方法，原因见ReadMe.txt*/
        UserDao userDaoBean = applicationContext.getBean("UserDaoBean", UserDao.class);


    }

    @Test
    public void TestLog4j2(){
        /*
        * 我们如何在代码中自己使用log4j2记录信息
        *
        * */
//        1创建日志对象，获取FirstSpringTest类的日志记录器对象
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
//        2，调用不同的方法，根据不同级别记录日志
        /*
        * 注意，我们这里的信息显示会收到配置文件配置日志级别影响，我们日志如果配置的级别是error,
        * 就不会显示高于error级别的日志，比如这里的info和debug都不会显示
        *  ALL<TRACE<DEBUG<INFO<WARN <ERROR < FATAL < OFF*/
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条报错信息");

    }
}
