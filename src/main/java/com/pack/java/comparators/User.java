package com.pack.java.comparators;

import lombok.Data;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/28
 */
@Data
public class User {

    private String userName;

    private Integer age;

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
