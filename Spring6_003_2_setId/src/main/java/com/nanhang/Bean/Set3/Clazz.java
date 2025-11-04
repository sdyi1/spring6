package com.nanhang.Bean.Set3;

/**
 * @author 徐
 * @version 1.0
 * @target 测试级联set注入
 * @date 2025/11/3
 * @ClassName Clazz(班级)
 */
public class Clazz {
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
