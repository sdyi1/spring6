package com.nanhang.study01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/9
 * @ClassName Component
 */

/*
* @Target是元注解，参数是一个数组，规定我们的Component注解可以出现的位置
* 如果参数是value那么这个value可以省略,如果只有一个参数，大括号可以省略
* ElementType.TYPE：注解可以出现在类上
* ElementType.FIELD：注解可以出现在成员变量(属性)上
*
* */
@Target(value = {ElementType.TYPE,ElementType.FIELD})
/*@Retention也是一个元注解
* 用于规定注解可以被识别的范围
* 这里的参数，表示注解保留在源代码中，不会被编译器删除，在编译后的class文件中也可以被读取
*
* */
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    /*定义注解的属性（类似于成员变量）
    * value :注解参数的属性名，好比上面@Target注解参数里面的value
    * value :注解参数的属性值
    * */

    String value();//如果属性名是value，使用的时候参数的value可以省略
}
