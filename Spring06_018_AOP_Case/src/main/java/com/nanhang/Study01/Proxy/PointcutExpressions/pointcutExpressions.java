package com.nanhang.Study01.Proxy.PointcutExpressions;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName pointcutExpressions
 */
public class pointcutExpressions {
    @Pointcut("execution(public * com.nanhang.Study01.Service.UserService.*(..))")
    public void pointcut(){

    }
}
