复习通过反射机制怎么读取注解


遇到的错误点，我在注解类中设置的元注解为@Retention(RetentionPolicy.CLASS)
这个设置意味着注解信息只会保留在编译后的.class文件中，而在运行时无法通过反射获取

我需要将这个元注解改成
@Retention(RetentionPolicy.RUNTIME)
这样子就可以被反射了

总结：
RetentionPolicy.SOURCE   <   RetentionPolicy.CLASS： <  RetentionPolicy.RUNTIME：