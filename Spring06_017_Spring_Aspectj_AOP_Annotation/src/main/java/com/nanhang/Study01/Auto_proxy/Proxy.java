package com.nanhang.Study01.Auto_proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/5
 * @ClassName Proxy
 */
@Component
@Aspect
public class Proxy {
    /*@Before("execution(public void com.nanhang.Study01.Service..*(..))")
    public void AutoProxy(){
        System.out.println("before方法执行");
    }*/

    //测试前置通知
    @Before("execution(public void com.nanhang.Study01.Service..*(..))")
    public void BeforeTest(){
        System.out.println("前置通知执行");
    }
    //测试后置通知
    @AfterReturning("execution(public void com.nanhang.Study01.Service..*(..))")
    public void AfterReturningTest(){
        System.out.println("后置通知执行");
    }
    //测试环绕通知
    @Around("execution(public void com.nanhang.Study01.Service..*(..))")
    public void AroundTest(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕通知执行");
        joinPoint.proceed();
        System.out.println("后环绕通知执行");
    }
    //测试异常通知
    @AfterThrowing("execution(public void com.nanhang.Study01.Service..*(..))")
    public void AfterThrowingTest(){
        System.out.println("异常通知执行");
    }
    //测试最终通知
    @After("execution(public void com.nanhang.Study01.Service..*(..))")
    public void AfterTest(){
        System.out.println("最终通知执行");
    }
}
