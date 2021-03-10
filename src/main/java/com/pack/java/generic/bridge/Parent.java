package com.pack.java.generic.bridge;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class Parent<T> {

    private T param1;

    private T param2;

    public void setFirst(T first) {
        param1 = first;
    }

    public void setSecond(T second) {
        param2 = second;
    }

    public  T getParam1() {
        return param1;
    }

    public T getParam2() {
        return param2;
    }

}
