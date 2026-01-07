package com.nanhang.Service.Impl;

import com.nanhang.Dao.Impl.sqlTestDaoImpl;
import com.nanhang.Dao.SqlTest;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/25
 * @ClassName SqlService
 */
public class SqlService implements com.nanhang.Service.SqlService {
    private SqlTest sqlTest = new sqlTestDaoImpl();

    @Override
    public void inster() {
        sqlTest.inster();
    }

    @Override
    public Boolean delete(int number) {
        Boolean delete = sqlTest.delete(number);

        return delete;
    }

    @Override
    public String update() {
        String update = sqlTest.update();

        return update;
    }
}
