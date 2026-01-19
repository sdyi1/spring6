Bean的生命周期：按照七步划分 在五步的基础上，在第三步前后添加操作

第一步:实例化Bean(调用无参数构造方法。)
第二步:给Bean属性赋值(调用set方法。)
第三步：执行“Bean后处理器”的before方法
第四步:初始化Bean(会调用Bean的init方法。注意:这个init方法需要自己写，自己配。)
第五步：执行“Bean后处理器”after方法
第六步:使用Bean
第七步:销毁Bean(会调用Bean的dèstroy方法。注意:这个destroy方法需要自己写，自己配。)


执行方法
1写一个实现类 实现BeanPostProcessor接口 重写里面的 before 和 after方法
2在方法中写你要执行 的操作
3在 配置文件中配置这个实现类，注意，这个实现类会作用于这个配置文件的所有类

