package com.nanhang.study02.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/11
 * @ClassName Component
 */
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    String value();
}
