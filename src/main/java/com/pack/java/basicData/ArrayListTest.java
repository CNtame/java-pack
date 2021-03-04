package com.pack.java.basicData;

import java.util.Arrays;
import java.util.List;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/2
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3);


        List<Integer> subData = data.subList(0, 3);
        System.out.println(subData);
    }
}
