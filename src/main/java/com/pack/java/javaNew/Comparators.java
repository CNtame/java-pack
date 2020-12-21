package com.pack.java.javaNew;

import java.util.Comparator;

/**
 * @author liu
 * @version 1.0
 * @description 比较器
 * @createDate 2020/12/9
 */
public class Comparators <T> implements Comparator <T> {

    @Override
    public int compare(T o1, T o2) {
        int i = (Integer) o1;
        int j = (Integer) o2;
        if (i > j) {
            return -1;
        }
        if (j > i) {
            return 1;
        }
        return 0;
    }
}
