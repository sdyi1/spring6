package com.nanhang.Study01;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/4
 * @ClassName UserService
 */
public class UserService {
    public void do1() {
        System.out.println("do 1");
    }

    public void do2() {
        System.out.println("do 2");
    }

    public void do3() {
        System.out.println("do 3");
    }

    public void do4() {
        System.out.println("do 4");
    }

    public void do5() {
        System.out.println("do 5");
    }

    //核心业务方法
    public void service() {
        try {
//Joinpoint连接点
            do1();//Pointcut切点
//Joinpoint连接点
            do2();//Pointcut切点
//Joinpoint连接点
            do3();//Pointcut切点
//Joinpoint连接点
            do5();//Pointcut切点
//Joinpoint连接点
        } catch (Exception e) {
//Joinpoint连接点
        } finally {
            //Joinpoint连接点
        }
    }
}

//连接点：可以织入增强代码的位置，切点上下两个
//切点，两个连接点的中间 好比切西瓜
//通知:不同位置织入增强代码的不同叫法 切点上面放叫前置通知，... ...见图2 picture/02
//切面：切点+通知
//织入:添加增强代码的这个动作
