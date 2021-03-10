package com.pack.java.generic;

import java.util.Comparator;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class ChildTest implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
