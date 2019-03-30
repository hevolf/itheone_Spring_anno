package com.evolf.cap11_Transactional.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author caohaifengx@163.com 2019-03-23 22:46
 */
@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //操作数据库
    //操作数据的方法
    public void insert(){
        String sql = "insert into `order` (ordertime, ordermoney, orderstatus) values(?,?,?)";
        jdbcTemplate.update(sql,new Date(),22,0);
    }
}
