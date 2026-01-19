package com.nanhang;

import com.nanhang.Service.SqlService;
import com.nanhang.poxy.sout_Invocation_Handler;

import java.lang.reflect.Proxy;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/25
 * @ClassName ${NAME}
 */
public class Main {
    public static void main(String[] args) {
        SqlService sqlService = new com.nanhang.Service.Impl.SqlService();

        SqlService sqlService1 = (SqlService) Proxy.newProxyInstance(
                sqlService.getClass().getClassLoader(),
                sqlService.getClass().getInterfaces(),
                new sout_Invocation_Handler(sqlService));


        sqlService1.inster();
        System.out.println(sqlService1.delete(2));
        System.out.println(sqlService1.update());

    }
}