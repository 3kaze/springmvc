package com.wzw.entity;

import lombok.Data;

/**
 * @author wei
 * @Date 2021/6/17
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Address address;
}
