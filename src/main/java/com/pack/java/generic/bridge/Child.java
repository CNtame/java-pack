package com.pack.java.generic.bridge;

import java.util.Comparator;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class Child extends Parent<String>  {


    public void setSecond(String second) {
        if (second.compareTo(getParam1()) > 0) {
            super.setSecond(second);
        }
    }

    public String getSecond() {
        return (String) super.getParam2();
    }
}
