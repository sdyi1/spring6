1给Bean赋值的注解：IOC注解之@Autowired和@Qualifier注解

Auto: 自动
wired: 织入
Autowired: 自动装配


----------------
单独使用@Autowired注解，默认是根据类型自动装配（byType 相关只是见Spring6_003_2_setId com.nanhang.Bean.set08）
如果需要ByName 需要@Autowired和@Qualifier注解一起使用

@Autowired可以出现在属性，set方法，构造方法，构造方法的参数上