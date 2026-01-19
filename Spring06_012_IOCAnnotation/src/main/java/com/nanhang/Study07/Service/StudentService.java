package com.nanhang.Study07.Service;

import com.nanhang.Study07.Dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/19
 * @ClassName StudentService
 */
@Service("studentService")
public class StudentService {
    @Resource(name = "student02Impl")
    private StudentDao studentDao;
    /* 不配置name属性会默认将对象的属性名作为注解属性名字（student02Impl）
    @Resource
    private StudentDao student02Impl;
    */

    public void inster(){
        studentDao.inster();
    }

}
