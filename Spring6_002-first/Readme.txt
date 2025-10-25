
第一个Spring程序

添加Spring 的基础依赖context
了解Spring配置类
使用Spring的IOC容器实例化对象，再从容器中获取对象

--------------------------------------------------------------------------------------------------------
1 配置类中对象的id是不能重复的，具有唯一性
2 spring是怎么实例化对象的?
    默认情况下，通过反射机制，调用类的无参构造，实例化对象 （所以如果写了有参构造就需要手写一个无参构造）
     实现原理如下：(看不懂需要去复习反射知识点)
       Class clazz =  Cass.forName("com.nanhang.spring6.bean.User");
       Object obj = clazz.newInstance();//使用对象空参实例化
3 spring容器创建好的对象实际上是存储再Map<String,Object>中
       键存储的是BeanId
       值存储的是通过Bean class属性 而实例化的对象
4 可以有多个spring配置类，一个spring容器对象（ClassPathXmlApplicationContext）可以一次性传入多个配置类的类路径
5 在配置文件中是只可以使用自定义的Bean吗，那JDK自带的Bean可以放入吗（可以）
6 容器对象默认返回的是Object，我们需要使用里面的方法的时候就需要强转，有没有什么方法，可以容器对象直接返回指定对象
    我们在使用容器对象获取Bean对象的时候 除了传入BeanId 再传入一个对象 可以直接返回指定对象.class(如下)
    UserDao userDaoBean = applicationContext.getBean("UserDaoBean", UserDao.class);
7 Spring底层的IOC的实现是使用了 XMl解析+反射机制+工厂模式(可以查看ClassPathXmlApplicationContext最顶层的父类)（暂时不了解工厂模式）

------------------------------------------------------------------------------------------------------------------------
日志依赖log4j2的使用
首先添加依赖
再配置配置文件 注意：这个配置文件的名字必须是log4j2.xml