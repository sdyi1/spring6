package com.nanhang.Bean.Set07;

/**
 * @author 徐
 * @version 1.0
 * @target 测试p命名空间注入 复杂数据类型
 * @date 2025/11/5
 * @ClassName animals
 */
public class animals {
    private String animalsWhat;



    public void setAnimalsWhat(String animalsWhat) {
        this.animalsWhat = animalsWhat;
    }
    @Override
    public String toString() {
        return "animals{" +
                "animalsWhat='" + animalsWhat + '\'' +
                '}';
    }
}
