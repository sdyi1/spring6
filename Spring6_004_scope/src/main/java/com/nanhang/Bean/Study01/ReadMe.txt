测试IOC容器创建的对象是单例还是多例，如何改成多例
------------------------------------------------------------------------------
1 再我们使用 new ClassPathXmlApplicationContext 读取配置文件的时候就会把配置文件里面的对象给实例化
    而不是再getBean的时候实例化的
2我们再使用IOC容器实例化对象的时候，多次使用getBean获取对象默认都是单例，对象都是同一个地址的对象

3如何修改成多例模式，再bean标签中配置scope属性 修改为prototype 就改成多例了

4在多例的情况下，在使用new ClassPathXmlApplicationContext 读取配置文件的时候就不会实例化对象了，因为你要多个，它又不知道你要多少个对象，只能你getBean一次，spring实例化一个对象

5 prototype还有request 和session... ...等值
    request session是web项目中才可以使用
    request:一次请求达中一个bean
    session:一次会话中一个bean