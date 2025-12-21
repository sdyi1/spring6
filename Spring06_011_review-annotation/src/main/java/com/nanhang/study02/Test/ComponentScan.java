package com.nanhang.study02.Test;

import com.nanhang.study02.Annotation.Component;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/11
 * @ClassName ComponentScan
 */
public class ComponentScan {
    public static void main(String[] args) {
        //创建缓存用于存放对象
         Map<Object, Object> beanMap = new HashMap<>();
        //模仿IOC注解，我们知道包类路径，我们需要扫描包下面所有的类，将里面的对象实例化，根据键值对存入Map中
        String packageName="com.nanhang.study02.Bean";
        /*会将包名中的.替换成/ com/nanhang/study02/Bean
        //但是注意，正则表达式中.表示任意字符，这样子的结果就是////////////////////////
        所以这里需要使用\，但是java语言中，我们需要转义字符 \，所以这里需要使用\\
        最后结果 \\.才表示.*/
        String packagePath = packageName.replaceAll("\\.", "/");

        /*获取到了类路径后，我们通过lassLoader.getSystemClassLoader()
        创建系统类加载器，通过类加载器找到Bean文件
        再通过getResource()方法定位文件
        */
        URL resource = ClassLoader.getSystemClassLoader().
                getResource(packagePath);
//        调用getPath()方法获取绝对路径
        String path = resource.getPath();

        //根据绝对路径创建File对象
        File file = new File(path);
        //根据File对象获取所有的文件
        File[] files = file.listFiles();
        //遍历所有的文件,并且获取文件名
        Arrays.stream(files).forEach(f -> {
            //我们获取到类名，和包的类路径拼接，就得到了类的类路径 com.nanhang.study02.Bean.类名
            String className = packageName+"."+f.getName().split("\\.")[0];
            //知道了类路径，再获取到id就可以做到和配置类一样的效果 id class 就可以实例化对象放入缓存中
            try {
                Class<?> aClass = Class.forName(className);
                //判断有没有这个注解，有就表示这个类是需要实例化的Bean，这个注解我们配置的是只能在Bean中使用
                if (aClass.isAnnotationPresent(Component.class)) {
                    //获取注解
                    Component annotation = aClass.getAnnotation(Component.class);
                   //获取注解的value作为放入缓存的id
                    String value = annotation.value();
                    //有了id和class接下来就是实例化对象放入缓存中
                        //获取构造器
                    Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
                        //实例化对象
                    Object o = declaredConstructor.newInstance();
                        //放入缓存
                    beanMap.put(value,o);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        System.out.println(beanMap);
    }
}
