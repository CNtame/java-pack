package com.pack.java.generic;

import java.util.Comparator;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/10
 */
public class test {


    public static void main(String[] args) {
        Comparator comparator = new ChildTest();
        Object a = "4";
        Object b = "5";
        int res = comparator.compare(a, b);
        System.out.println(res);

    }
}
