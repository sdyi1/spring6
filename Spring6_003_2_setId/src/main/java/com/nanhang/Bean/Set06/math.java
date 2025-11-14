package com.nanhang.Bean.Set06;

/**
 * @author 徐
 * @version 1.0
 * @target  实验注入特殊字符
 * @date 2025/11/5
 * @ClassName math
 */
public class math {
    private String result;
    private String result2;


    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "math{" +
                "result='" + result + '\'' +
                ", result2='" + result2 + '\'' +
                '}';
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

}
