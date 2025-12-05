Spring处理循环依赖Bean的底层逻辑
1进入AbstractAutowireCapableBeanFactory类
    底层会在这个类里面的doCreateBean方法完成Bean的创建赋值
    1创建bean 2将bean放入缓存（曝光） 3赋值Bean

    2:放入缓存的是addSingletonFactory ctrl+b 进去这个方法所在类DefaultSingletonBeanRegistry我们可以看及有三个Map集合
     Map<String, Object> singletonObjects （我们称为一级缓存）
     Map<String, Object> earlySingletonObjects （我们称为二级缓存）
     Map<String, ObjectFactory<?>> singletonFactories （我们称为三级缓存）

     这三个缓存的key存储的是Bean的id

     一级缓存存储的是完整的单例Bean对象，这个缓存里面的Bean对象都已经赋值完成
     二级缓存存储的是早期单例Bean对象，这个缓存里面的Bean对象还没有赋值完成
     三级缓存存储的是单例Bean的工厂对象，这个缓存里面的Bean对象还没有创建完成，但是可以返回一个代理对象


