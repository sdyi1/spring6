package com.nanhang.Dao;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bean
 * 实验多属性的全参构造构造注入
 * @author 徐
 * @version 1.0
 * @date 2025/10/28
 * @ClassName ConstomerDao
 */
public class ConstomerDao {
   private static final Logger logger =LoggerFactory.getLogger(ConstomerDao.class);

   private void save(){
       logger.info("管理员用户存入");
   }
}
