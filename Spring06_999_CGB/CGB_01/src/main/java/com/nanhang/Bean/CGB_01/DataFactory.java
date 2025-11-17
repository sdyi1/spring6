package com.nanhang.Bean.CGB_01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/17
 * @ClassName DataFactory
 */
public class DataFactory implements FactoryBean<Date> {



    private String DataBirth;
    //构造函数
     public DataFactory(String dataBirth) {
        DataBirth = dataBirth;
    }


    @Override
    public Date getObject() throws Exception {
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(DataBirth);
        return parse;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
