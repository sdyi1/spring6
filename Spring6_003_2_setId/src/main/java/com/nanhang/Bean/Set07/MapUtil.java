package com.nanhang.Bean.Set07;

import java.util.Properties;

/**
 * @author 徐
 * @version 1.0
 * @target 测试util命名空间 给两个不同的类赋值
 * @date 2025/11/5
 * @ClassName MapUtil
 */
public class MapUtil {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "MapUtil{" +
                "properties=" + properties +
                '}';
    }
}
