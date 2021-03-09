package com.pack.java.polymorphism;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class Parent {

    private Integer param1;

    private Integer param2;

    public Integer getParam1() {
        return param1;
    }

    public void setParam1(Integer param1) {
        this.param1 = param1;
    }

    public Integer getParam2() {
        return param2;
    }

    public void setParam2(Integer param2) {
        this.param2 = param2;
    }

    public Parent(Integer param1, Integer param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
}
