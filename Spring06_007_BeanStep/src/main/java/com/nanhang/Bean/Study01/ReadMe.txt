Bean生命周期：按照五步来划分
第一步:实例化Bean(调用无参数构造方法。)
第二步:给Bean属性赋值(调用set方法。)
第三步:初始化Bean(会调用Bean的init方法。注意:这个init方法需要自己写，自己配。)
第四步:使用Bean
第五步:销毁Bean(会调用Bean的dèstroy方法。注意:这个destroy方法需要自己写，自己配。)

销毁Bean的理解
我们平时没有再类中写销毁Bean的方法，也没有手动关闭Spring的时候
当main方法执行完毕或者JVM进程结束时，Spring容器会随着整个程序的终止而直接关闭，操作系统回收资源