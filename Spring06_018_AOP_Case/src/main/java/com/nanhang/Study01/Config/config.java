package com.nanhang.Study01.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName config
 */
@Configuration
@ComponentScan({"com.nanhang.Study01.Service", "com.nanhang.Study01.Proxy"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class config {
}
