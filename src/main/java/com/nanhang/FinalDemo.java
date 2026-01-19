package com.nanhang;

/**
 * final关键字复习示例
 * final关键字在Java中用于限制对类、方法或变量的修改
 */
public class FinalDemo {

    // final变量 - 一旦赋值就不能改变
    final int finalVariable = 10;
    final static int STATIC_FINAL_VARIABLE = 100;
    
    // 普通变量
    int normalVariable = 5;

    /**
     * final方法 - 不能被子类重写
     */
    final void finalMethod() {
        System.out.println("这是一个final方法，不能被重写");
    }

    /**
     * 普通方法 - 可以被子类重写
     */
    void normalMethod() {
        System.out.println("这是一个普通方法，可以被重写");
    }

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo();
        
        // 演示final变量
        System.out.println("Final变量: " + demo.finalVariable);
        System.out.println("静态Final变量: " + STATIC_FINAL_VARIABLE);
        
        // 可以修改普通变量
        demo.normalVariable = 20;
        System.out.println("修改后的普通变量: " + demo.normalVariable);
        
        // 调用方法
        demo.finalMethod();
        demo.normalMethod();
        
        // 创建子类实例
        FinalDemoChild child = new FinalDemoChild();
        child.normalMethod(); // 调用被重写的方法
        child.finalMethod();  // 调用继承的final方法
    }
}

/**
 * final类的示例 - 无法被继承
 * 注意：下面的类被注释掉，因为如果取消注释会导致编译错误
 */
// final class FinalClass {
//     public void someMethod() {
//         System.out.println("这是一个final类");
//     }
// }

/**
 * 尝试继承final类会导致编译错误
 * 如果取消下面的注释，会得到编译错误："无法继承final类"
 */
// class TryToExtendFinalClass extends FinalClass {  // 编译错误！
//     // 这个类无法编译，因为不能继承final类
// }

/**
 * 非final类，可以被继承
 */
class FinalDemoChild extends FinalDemo {
    // 不能重写final方法，这会导致编译错误
    // @Override
    // void finalMethod() { }  // 编译错误！
    
    // 可以重写普通方法
    @Override
    void normalMethod() {
        System.out.println("在子类中重写的普通方法");
    }
}

/**
 * 演示final类的例子 - String类是final类
 */
class StringFinalDemo {
    public static void main(String[] args) {
        // String类是final类，所以不能被继承
        // 下面的代码会导致编译错误
        // class MyString extends String { }  // 编译错误！
        
        String str = "Hello";
        System.out.println("String是final类，不能被继承: " + str);
    }
}