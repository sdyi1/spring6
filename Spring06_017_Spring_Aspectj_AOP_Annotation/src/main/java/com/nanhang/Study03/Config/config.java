package com.nanhang.Study03.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName config
 */
@Configuration//告诉spring这个是配置类
@ComponentScan("com.nanhang.Study03")//代替配置文件扫描component注解
@EnableAspectJAutoProxy(proxyTargetClass = true)// 代替配置文件开启aspectj的动态代理,默认为开启

public class config {
}
