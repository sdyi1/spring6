package com.nanhang.Study01.Service.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/21
 * @ClassName Timer_invocationHandler
 */
public class Timer_invocationHandler implements InvocationHandler {
    private Object OrderImpl;

    //我们需要利用反射执行目标对象的目标方法，需要用到目标对象，参考反射四要素，对象，参数，方法，返回值，参数和方法在invoke参数中 args和method已经提供
    public Timer_invocationHandler(Object orderImpl) {
        OrderImpl = orderImpl;
    }
    /*1．为什么强行要求你必须实现InvocationHandler接口？
        因为一个类实现接口就必须实现接口中的方法。
        以下这个方法必须是invoke（O，因为JDk在底层调用invokeO方法的程序已经提前写好了。
        注意：invoke方法不是我们程序员负责调用的，是JDK负责调用的。
    2．invoke方法什么时候被调用呢？
        当代理对象调用代理方法的时候，注册在InvocationHandler接口里面的invoke()方法被调用

    3invoke三个参数：
        参数一:Object proxy
        参数二：目标对象的目标方法
        参数三：目标方法上的参数

        */


    /*方法理解:
    *   返回值为Object ：Java 类层次结构的根类，所有引用类型都直接或间接继承自 Object
    *   我们的接口方法可能返回不同数据类型，Object包含了所有可能的情况*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke执行");

        ///method是方法对象，invoke是执行方法对象的方法，如果看不懂，复习通过反射获取方法，仔细看！！
        Object invoke = method.invoke(OrderImpl, args);
        System.out.println("invoke结束");
        return invoke;
    }
}
