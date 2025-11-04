package com.nanhang.Dao;

import com.nanhang.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/27
 * @ClassName UserDao
 */
public class UserDao {
    //日志对象
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void intoTest(){
        /*使用log4j2日志*/
        logger.info("数据库正在保存");
    }
}
