
复习注解
review  :复习
annotation：注解 注释

注意 元注解RetentionPolicy参数的范围

RetentionPolicy.SOURCE：
        注解只存在于源代码中
        编译时会被丢弃，不会写入到.class文件中
        无法通过反射读取
RetentionPolicy.CLASS：
        注解会被保留在.class文件中
        但是在运行时无法通过反射读取（这是默认值）
        只在编译时和静态分析时可用
RetentionPolicy.RUNTIME：
        注解会被保留在.class文件中
        在运行时也可以通过反射机制读取
        功能最强大，适用范围最广
