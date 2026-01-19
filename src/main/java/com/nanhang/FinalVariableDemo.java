package com.nanhang;

/**
 * final变量初始化规则演示
 */
public class FinalVariableDemo {
    
    // 声明final变量但不立即初始化 - 这是允许的
    final int instanceVariable;
    final int anotherInstanceVariable;
    
    // 静态final变量
    static final int STATIC_FINAL;
    
    // 在构造函数中初始化final实例变量
    public FinalVariableDemo() {
        this.instanceVariable = 10; // 构造函数中初始化
        this.anotherInstanceVariable = 20; // 构造函数中初始化
    }
    
    // 静态初始化块中初始化静态final变量
    static {
        STATIC_FINAL = 100;
    }
    
    // 声明时就初始化的final变量
    final int initializedAtDeclaration = 5;
    static final int STATIC_INITIALIZED_AT_DECLARATION = 50;
    
    public static void main(String[] args) {
        FinalVariableDemo demo = new FinalVariableDemo();
        
        System.out.println("实例变量（构造函数初始化）: " + demo.instanceVariable);
        System.out.println("另一个实例变量（构造函数初始化）: " + demo.anotherInstanceVariable);
        System.out.println("静态变量（静态块初始化）: " + FinalVariableDemo.STATIC_FINAL);
        System.out.println("声明时初始化的实例变量: " + demo.initializedAtDeclaration);
        System.out.println("声明时初始化的静态变量: " + FinalVariableDemo.STATIC_INITIALIZED_AT_DECLARATION);
        
        // 演示不能重新赋值
        // demo.instanceVariable = 30; // 这行代码会导致编译错误
    }
    
    // 也可以在初始化块中初始化实例final变量
    {
        // instanceVariable = 15; // 这会与构造函数中的初始化冲突，导致编译错误
    }
}