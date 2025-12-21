package com.nanhang.Study06.Dao.Impl;

import com.nanhang.Study06.Dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/19
 * @ClassName Student02Impl
 */
@Repository
public class Student02Impl implements StudentDao {
    @Override
    public void inster() {
        System.out.println("student02正在学习");
    }
}
