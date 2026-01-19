@Resource注解

@Resource注解也可以完成非简单类型注入。那它和@Autowired注解有什么区别？
·@Resource注解是JDK扩展包中的，也就是说属于JDK的一部分。所以该注解是标准注解，更加具有通用性。(SR-250标准中制定的注解类型。JSR是Java规范提案。）
·@Autowired注解是Spring框架自己
·@Resource注解默认根据名称装配byName，未指定name时，使用属性名作为name。通过name找不到的话会自动启动通过类型byType装配。
·@Autowired注解默认根据类型装配byType，如果想根据名称装配，需要配合@Qualifier注解一起用。
·@Resource注解用在属性上、setter方法上。
·@Autowired注解用在属性上、setter方法上、构造方法上、构造方法参数上。


--------------------------------------------------------------------------------

使用@Resource注解首先需要添加依赖
<dependency>
   <groupId>jakarta.annotation</groupId>
   <artifactId>jakarta.annotation-api</artifactId>
   <version>2.1.1</version>
</dependency>

-------------------------------------------------------------------------------------
错误笔记
    @Resource需要加入name属性，如果没有添加，会默认将成员变量的属性名字作为name