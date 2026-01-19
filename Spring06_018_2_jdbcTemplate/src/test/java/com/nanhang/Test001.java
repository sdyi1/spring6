package com.nanhang;

import com.nanhang.Study01.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/10
 * @ClassName Test001
 */
public class Test001 {
    /*尝试批量添加 (批量修改和批量删除的原理和批量添加一样，有时间自己尝试)*/
    @Test
    public void test01_4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into userforstudyspringjdbc (real_name,age)values(?,?)";
        //准备数据
        Object[] objs1={"小花","23"};
        Object[] objs2={"小花2","21"};
        Object[] objs3={"小花3","22"};
        List<Object[]> list = new ArrayList<>();
        //添加到list集合
        list.add(objs1);
        list.add(objs2);
        list.add(objs3);
        //执行sql语句
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
    }
    /*尝试查询 多个对象*/
    @Test
    public void test01_3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql ="select id,real_name,age from userforstudyspringjdbc";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        for (User user : userList) {
            System.out.println(user);
        }
    }
    /*尝试查询 单个对象*/
    @Test
    public void test01_2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select id,real_name,age from userforstudyspringjdbc where id = ?";
        //new BeanPropertyRowMapper<>(User.class)的作用：将查询出来的结果映射成某个对象
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);


    }
    /*初始尝试使用jdbc链接数据库，增删改都是update方法*/
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring06_Study01_Application.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into userforstudyspringjdbc (real_name,age)values(?,?)";
        jdbcTemplate.update(sql,"张三","21");
        System.out.println(jdbcTemplate);
    }
}
