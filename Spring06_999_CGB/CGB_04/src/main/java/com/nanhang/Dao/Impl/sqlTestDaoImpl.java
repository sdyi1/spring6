package com.nanhang.Dao.Impl;

import com.nanhang.Dao.SqlTest;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/25
 * @ClassName sqlTestDaoImpl
 */
public class sqlTestDaoImpl implements SqlTest {
    @Override
    public void inster() {
        try {
            Thread.sleep(122);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("mysql查询正在执行");
    }

    @Override
    public Boolean delete(int number) {
        try {
            Thread.sleep(1212);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("mySql正在删除ID为"+number+"的数据");
        return true;
    }

    @Override
    public String update() {
        try {
            Thread.sleep(1223);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("mySql正在修改数据");
        return "修改成功";
    }
}
