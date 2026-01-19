package org.myspringframwork.core;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/1
 * @ClassName ApplicationContext
 */
/*更具我们以前的test里面的内容，我们首先会new 一个ApplicationContext，里面有getBean方法*/
public interface ApplicationContext {
    Object getBean(String BeanName);
}
