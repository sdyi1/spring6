package com.nanhang.Study01.Dao.Impl;

import com.nanhang.Study01.Dao.accountDao;
import com.nanhang.Study01.Pojo.user;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/14
 * @ClassName accountDaoImpl
 */
@Repository
public class accountDaoImpl implements accountDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public user select(String actno) {
        String sql ="select actno,balance from user where actno =?";
        user user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(user.class), actno);
        return user;
    }

    @Override
    public int update(user user) {
        String sql = "update user set balance = ? where actno=?";
        int update = jdbcTemplate.update(sql, user.getBalance(), user.getActno());
        return update;
    }
}
