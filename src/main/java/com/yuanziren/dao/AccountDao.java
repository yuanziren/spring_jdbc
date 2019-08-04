package com.yuanziren.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 转出操作
     * @param id
     * @param money
     */
    public void outMoney(int id, double money){
        String sql = "update account set money=money-? where id=?";
        jdbcTemplate.update(sql, money, id);
    }

    /**
     * 转入操作
     * @param id
     * @param money
     */
    public void inMoney(int id, double money){
        String sql = "update account set money=money+? where id=?";
        jdbcTemplate.update(sql, money, id);
    }
}
