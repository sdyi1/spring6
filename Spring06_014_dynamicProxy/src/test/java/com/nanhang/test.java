package com.nanhang;

import com.nanhang.Study01.Service.Impl.OrderImpl;
import com.nanhang.Study01.Service.Impl.Timer_invocationHandler;
import com.nanhang.Study01.Service.OrderService;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/21
 * @ClassName test
 */
public class test {
    @Test
    public void Test01(){
    /*按照静态代理的步骤，
    先实例化目标对象，
    再实例化代理对象
    最后调用代理对象的代理方法*/

        //实例化目标对象
        OrderService orderService = new OrderImpl();

        //实例化代理对象(借助JDK里面的类 java.lang.reflect.Proxy)
        /*
        1．newProxyInstance翻译为：新建代理对象
            也就是说，通过调用这个方法可以创建代理对象。
          本质上，这个Proxy.newProxyInstanceO)方法的执行，做了两件事：
            第一件事：在内存中动态的生成了一个代理类的字节码class。
            第二件事：new对象了。通过内存中生成的代理类这个代码，实例化了代理对象。
        2．关于newProxyInstance(方法的三个重要的参数，每一个什么含义，有什么用？]
    第一个参数：ClassLoaderloader
                类加载器。这个类加载器有什么用呢？
                    在内存当中生成的字节码也是class文件，要执行也得先加载到内存当中。
                    加载类就需要类加载器。所以这里需要指定类加载器。
                    并且JDK要求，目标类的类加载器必须和代理类的类加载器使用同一个。
                所以我们需要获取目标类的类加载器传进去，给代理类明确规定使用这个类加载器
    第二个参数：Class<?>[]interfaces
                代理类和目标类要实现同一个接口或同一些接口。 参数2传入接口使得代理类可以直接实现我们的接口，做到代理类和目标类实现同一个接口
                在内存中生成代理类的时候，这个代理类是需要你告诉它实现哪些接口的。
    第三个参数：InvocationHandler
            InvocationHandler被翻译为：调用处理器。是一个接口。
            在调用处理器接口中编写的就是：增强代码。
            因为具体要增强什么代码，JDK动态代理技术它是猜不到的。没有那么神。
            既然是接口，就要写接口的实现类。
        可能会有疑问？
            自己还要动手写调用处理器接口的实现类，这不会类爆炸吗？不会。
            因为这种调用处理器写一次就好

        实现方法
            写一个实现类实现接口InvocationHandler,重写里面的方法
            再里面写需要添加的业务
            实例化放入参数三


            */
       // Proxy.newProxyInstance(类加载器，代理类要实现的接口，调用处理器)
        OrderService proxyInstance = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(),//通过实例化的对象获取类加载器
                orderService.getClass().getInterfaces(),//通过实例化的对象获取类的接口
                new Timer_invocationHandler(orderService));//这里传入目标对象解释见代理类构造方法注释
        //调用代理对象的代理方法
            //我们发现，invoke方法确实执行了，执行接口的每个方法都会被调用一次，但是问题来了，我们的目标方法并没有被执行
            //见动态代理类invoke方法三个参数的解释
        proxyInstance.generate();
        String string = proxyInstance.getString();
        System.out.println(string);


    }
}
