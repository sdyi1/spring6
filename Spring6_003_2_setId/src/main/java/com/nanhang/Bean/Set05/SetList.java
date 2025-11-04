package com.nanhang.Bean.Set05;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 徐
 * @version 1.0
     * @target 实验set注入 list/set/Map集合
 * @date 2025/11/4
 * @ClassName SetList
 */
public class SetList {
    private List<String> stringList;
    private Set<String> stringSet;
    private Map<Integer,String> integerStringMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public void setIntegerStringMap(Map<Integer, String> integerStringMap) {
        this.integerStringMap = integerStringMap;
    }

    @Override
    public String toString() {
        return "SetList{" +
                "stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", integerStringMap=" + integerStringMap +
                ", properties=" + properties +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
