package com.nanhang.Service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/1
 * @ClassName Time_MethodInterceptor
 */
public class Time_MethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        /*
        * 到了这里我们的步骤就显而易见了
        *   写出增强代码
        *   调用目标类方法
        *   写增强戴代码
        * */
//        增强代码
        System.out.println("增强代码1");
//        代理对象调用目标类方法
        Object retValue = methodProxy.invokeSuper(target, objects);
//        增强代码
        System.out.println("增强代码2");
        return retValue;
    }
}
