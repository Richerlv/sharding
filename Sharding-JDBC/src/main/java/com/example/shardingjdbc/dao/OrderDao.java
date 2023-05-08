package com.example.shardingjdbc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingjdbc.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lvyanling
 * @date 2023-05-08
 */
@Mapper
public interface OrderDao extends BaseMapper<Orders> {
}
