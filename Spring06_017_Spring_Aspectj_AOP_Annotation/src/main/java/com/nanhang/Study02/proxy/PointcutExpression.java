package com.nanhang.Study02.proxy;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName PointcutExpression
 */
public class PointcutExpression {
    @Pointcut("execution(public void com.nanhang.Study02.Service.UserService.*(..))")
    public  void poincutExpression(){

    }
}
