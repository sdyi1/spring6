package com.nanhang.Bean.set08;

/**
 * @author 徐
 * @version 1.0
 * @target 测试根据类型自动装配
 * @date 2025/11/8
 * @ClassName OrderDao
 */
public class OrderDao {
    private UserDao userDao;
    private VipUserDao vipUserDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipUserDao(VipUserDao vipUserDao) {
        this.vipUserDao = vipUserDao;
    }

    public void inster(){
        userDao.inster();
        vipUserDao.inter();
    }

}
