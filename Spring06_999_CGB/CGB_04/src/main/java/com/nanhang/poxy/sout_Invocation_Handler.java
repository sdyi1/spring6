package com.nanhang.poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/25
 * @ClassName sout_Invocation_Handler
 */
public class sout_Invocation_Handler implements InvocationHandler {
    private Object SqlObject;

    public sout_Invocation_Handler(Object sqlObject) {
        SqlObject = sqlObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String name = method.getName();
        System.out.println(name+"------------- ");
        Object invoke = method.invoke(SqlObject, args);
        return invoke;
    }
}
