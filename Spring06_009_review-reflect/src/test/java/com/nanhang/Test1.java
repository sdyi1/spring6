package com.nanhang;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/28
 * @ClassName Test1
 */
public class Test1 {

    /*复习利用反射机制获取方法*/
    @Test
    public void Test02() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /*首先获取类:参数为类全路径*/
        Class<?> aClass = Class.forName("com.nanhang.Bean.Study02.UserBean");
        /*获取方法 参数1:方法名 参数2:参数类型*/
        Method declaredMethod = aClass.getDeclaredMethod("doSome", String.class, int.class);
        /*调用方法
        * 记得前面的四要素吗，对象，方法名，参数，返回值
        * */
            /*首先获取对象:newInstance方法过时了，有兴趣了解一下新的方法*/
        Object o = aClass.newInstance();
        /*执行方法，四要素聚齐
        参数1：为对象，
        参数2：为方法参数，
        declaredMethods包含方法名字，
        invoke是方法返回值*/
        Object invoke = declaredMethod.invoke(o, "张三", 3);
        System.out.println(invoke);
    }

    /*我们知道用Spring实例化对象id class
    赋值需要提供 name 和赋值的value,我们尝试一下简单的Spring底层,
     在知道类名(class)
     属性名(name)
     的情况下使用反射给对象赋值
     */
    @Test
    public void Test03() throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
        * 需求:
            假设你现在已知以下信息:
            1.有这样一个类，类名叫做:com/nanhang/Bean/Study03/User2
            2、这个类符合javabean规范。（属性私有化，对外提供公开的setter和getter方法）
            * 3.你还知道这个类当中有一个属性，属性的名字叫做age
            请使用反射机制调用set方法，给User对象的age属性赋值
        * */
        String className="com.nanhang.Bean.Study03.User2";
        String property1Name = "name";
        String property2Name = "age";

        //获取类
        Class<?> aClass = Class.forName(className);
        //获取方法（需要先获取方法名字和参数数据类型）
            //更具属性名字获取属性的类型
            Field declaredField = aClass.getDeclaredField(property1Name);
            Field declaredField1 = aClass.getDeclaredField(property2Name);

            //获取方法名字(set方法的名字是set+属性名字的首字母大写)
            String setMethodName ="set"+ property1Name.toUpperCase().charAt(0)+property1Name.substring(1);
            String setMethodAge = "set"+ property2Name.toUpperCase().charAt(0)+property2Name.substring(1);

        //最后，根据类，方法名字，参数数据类型获取方法
        Method methodByName = aClass.getDeclaredMethod(setMethodName,declaredField.getType());
        Method methodByAge = aClass.getDeclaredMethod(setMethodAge,declaredField1.getType());
        /*实例化对象这里使用新的方法*/
            //获取无参构造
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            //创建对象
            Object obj = declaredConstructor.newInstance();
        /*调用set方法（两个参数是 ，二set方法参数的属）*/
        methodByName.invoke(obj, "张三");
         methodByAge.invoke(obj, 20);

        System.out.println(obj);

        /*总结：步骤
        首先获取类对象，
        然后在根据属性名字获取方法名字 和 属性数据类型
        再根据类对象+方法名字+数据类型属性 获取方法(因为set方法的参数就是属性，所以可以直接使用属性数据类型)
        实例化对象
        调用set方法给对象赋值
        */
    }





}
