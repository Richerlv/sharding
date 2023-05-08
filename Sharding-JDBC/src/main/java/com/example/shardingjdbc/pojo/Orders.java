package com.example.shardingjdbc.pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author lvyanling
 * @date 2023-05-08
 */
@Data
public class Orders implements Serializable {
    private Long id;
    private String orderNumber;
    private Timestamp createTime;
    private String creater;
    private double money;
}
