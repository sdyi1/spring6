package com.nanhang.Bean.Set04;

import java.util.Arrays;

/**
 * @author 徐
 * @version 1.0
 * @target 测试IOC容器数组注入
 * @date 2025/11/3
 * @ClassName QianDaye
 */
public class QianDaye {


    //普通数据类型注入
    private String[] Like;
    //复杂数据类型注入
    private Grils[] grils;

    public void setLike(String[] like) {
        Like = like;
    }

    public void setGrils(Grils[] grils) {
        this.grils = grils;
    }

    @Override
    public String toString() {
        return "QianDaye{" +
                "Like=" + Arrays.toString(Like) +
                ", grils=" + Arrays.toString(grils) +
                '}';
    }
}
