package com.nanhang.Study07.Dao.Impl;

import com.nanhang.Study07.Dao.UserDao;
import com.nanhang.Study07.Pojo.user;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/19
 * @ClassName UserDaoImpl
 */
@Repository("userDaoImpl")
@Transactional()
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public void save(user user) {
        String sql = "insert into user (actno,balance) value (?,?)";
        int update = jdbcTemplate.update(sql, user.getActno(), user.getBalance());

    }

    @Override
    public user select(String userActno) {
        String sql = "select * from user where actno = ?";
        user user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(user.class), userActno);
        return user;
    }
}
