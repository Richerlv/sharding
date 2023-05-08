package com.example.shardingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.shardingjdbc.dao.OrderDao;
import com.example.shardingjdbc.pojo.Orders;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingJdbcApplicationTests {

    @Autowired
    OrderDao orderDao;
    @Test
    void insertTest() {
        for (int i = 0; i < 2; i++) {
            Orders order=new Orders();
            order.setCreater("Richerlv");
            order.setOrderNumber("6");
            order.setCreateTime(new Timestamp(System.currentTimeMillis()));
            order.setMoney(30.01);
            orderDao.insert(order);
        }
    }
    @Test
    void  selectTest(){
        QueryWrapper<Orders> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",1553218859002007553L);
        Orders orders = orderDao.selectOne(queryWrapper);
        System.out.println(orders);
    }

}
