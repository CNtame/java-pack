package com.pack.java.lambda;

import lombok.Data;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/29
 */
@Data
public class User {

    private String userName;

    private Integer age;

    private Integer high;

    public User(String userName,Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public void test1() {
        System.out.println(age);
    }
}
