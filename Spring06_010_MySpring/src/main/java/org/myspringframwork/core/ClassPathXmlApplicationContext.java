package org.myspringframwork.core;


import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/1
 * @ClassName ClassPathXmlApplicationContext
 */
public class ClassPathXmlApplicationContext implements ApplicationContext{

    private Map<String,Object> singletonObject = new HashMap<>();
    //这里负责根据传入的配置文件路径，将配置文件里面的Bean实例化，再结合配置文件的id将bean放入Mapper集合中（三级缓存知识点）
    public ClassPathXmlApplicationContext(String configLocation) {
      //首先解析xml文件，然后实例化Bean将Bean曝光(放入singletonObject中)

        //解析XML文件
        try {
            //这是dom4j解析XML的核心对象
            SAXReader saxReader = new SAXReader();
            //获取一个输入流，指向XMl文件(重点复习)  //这是使用ClassLoader (类加载器)调用 getSystemClassLoader() (获取系统类加载器)
            //getResourceAsStream(configLocation) 获取资源输入流
            InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);

            //读取文件,获取Document对象,Document对象封装了XML文件
            Document document = saxReader.read(resourceAsStream);
            System.out.println("这是读取到的xml文件-----------------------------------");
            System.out.println(document.toString());
            System.out.println("这是读取到的xml文件-----------------------------------");
            //获取所有的Bean标签,会返回一个List集合，每个元素都是一个Node对象，代表一个Bean标签
            List<Node> nodes = document.selectNodes("/bean/bean");
            //使用lambda表达式遍历Node集合(复习lambda表达式，和普通的for循环的区别)
            nodes.forEach(node -> {
                try {
                    System.out.println("这是遍历的Bean标签-----------------------------------");
                    System.out.println(node);
                    System.out.println("这是遍历的Bean标签-----------------------------------");

                    //向下转型，可以使用Element里面更丰富的方法
                    Element beanElement = (Element) node;
                    //获取属性 id class的值，更具标签属性的名字获取配置文件对应属性的值
                    String idName = beanElement.attributeValue("id");
                    String className = beanElement.attributeValue("class");
                    //实例化对象
                    Class<?> aClass = Class.forName(className);
                    Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
                    Object o = declaredConstructor.newInstance();

                    //将对象放入Map集合
                    singletonObject.put(idName,o);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            });



            //再次遍历Bean标签，这次是给对象属性赋值
            nodes.forEach(node -> {
            //依旧向下转型
                /*Element的attribute和element方法的区别见注释1*/
                Element element1 = (Element) node;
                String idName = element1.attributeValue("id");
                String className = element1.attributeValue("class");
                List<Element> propertys = element1.elements("property");
                propertys.forEach(property ->{
                    //获取属性
                    String name = property.attributeValue("name");
                    String value = property.attributeValue("value");
                    String ref = property.attributeValue("ref");

                    //获取方法
                        //先获取set方法名
                    String methodName = "set"+name.toUpperCase().charAt(0)+name.substring(1);
                    try {
                        Class<?> aClass = Class.forName(className);
                        //获取参数类型(根据属性名字获取属性类型)
                        Field declaredField = aClass.getDeclaredField(name);
                        //获取方法(根据方法名字和参数数据类型获取方法)
                        Method declaredMethod = aClass.getDeclaredMethod(methodName, declaredField.getType());
                        //调用set方法
                            if(value!=null){
                                /* 错误的操作，原因，我们前面通过属性名称获取到的set方法参数值的attributeValue
                                String value = property.attributeValue("value");
                                的返回值始终是String ,如果我们要注入的是其他数据类型就无法直接调用invoke方法
                                */
                                /*declaredMethod.invoke(singletonObject.get(idName),value);*/
                                /*为什么不直接declaredField.getType().getName();
                                *   直接getName获取的是数据类型的包，带有前缀 org.
                                * */
                                String simpleName = declaredField.getType().getSimpleName();
                                //创建一个object来接住值
                                Object actualValue = null;
                                /*判断属于哪一种简单数据类型，再直接强转*/
                                switch (simpleName){
                                    case "byte":
                                        actualValue = Byte.parseByte(value);
                                        break;
                                    case "short" :
                                        actualValue = Short.parseShort(value);
                                        break;
                                    case "int":
                                        actualValue = Integer.parseInt(value);
                                        break;
                                    case "long" :
                                        actualValue = Long.parseLong(value);
                                        break;
                                    case "float":
                                        actualValue = Float.parseFloat(value);
                                        break;
                                    case "double":
                                        actualValue = Double.parseDouble(value);
                                        break;
                                    case "boolean":
                                        actualValue = Boolean.parseBoolean(value);
                                        break;
                                    case "char":
                                        actualValue = value.charAt(0);
                                        break;
                                    case "Byte":
                                        actualValue = Byte.valueOf(value);
                                        break;
                                    case "Short":
                                        actualValue = Short.valueOf(value);
                                        break;
                                    case "Integer":
                                        actualValue = Integer.valueOf(value);
                                        break;
                                    case "Long":
                                        actualValue = Long.valueOf(value);
                                        break;
                                    case "Float":
                                        actualValue = Float.valueOf(value);
                                        break;
                                    case "Double":
                                        actualValue = Double.valueOf(value);
                                        break;
                                    case "Boolean":
                                        actualValue = Boolean.valueOf(value);
                                        break;
                                    case "Character":
                                        actualValue = value.charAt(0);
                                        break;
                                    case "String":
                                        actualValue = value;
                                        break;

                                }
                                //强转后调用方法注入属性
                                declaredMethod.invoke(singletonObject.get(idName),actualValue);
                            }else if (ref!=null){
                                //更具ref实例化对象

                                declaredMethod.invoke(singletonObject.get(idName),singletonObject.get(ref));
                            }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });



            });


        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    //当用户调用getbean方法的时候，会根据传入的名称从Map中寻找Bean
    @Override
    public Object getBean(String BeanName) {

        return singletonObject.get(BeanName);
    }
}
/*------------------------------------------------------------------------------------*/
/*一.element和attribute的区别：
*      1.  Attribute（属性）
            属性是元素开始标签中的名称/值对
            属性提供关于元素的附加信息
            属性总是作为名称/值对出现，位于元素的开始标签内 类似于 id class value等
       2. Element（元素）
            元素是XML文档的基本构建块，由开始标签、内容和结束标签组成
            元素可以包含其他元素、文本内容或两者兼有
            元素可以有属性
            类似于 bean property 等
            * */


