package com.yuanziren;

import com.yuanziren.service.AccountService;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringJdbcTest {
    /*@Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

    }*/

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Test
    public void test01() {
        String sql = "select count(*) from account";
        Integer total = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("Total: "+total);
    }

    @Test
    public void test02() {
        accountService.zhuanzhang(8,9,100.00);
    }
}
