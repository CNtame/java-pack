package com.pack.java.dataStructure.using;

import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/1/2
 */
public class ArrayUsing {


    public static void main(String[] args) {
        //数组拷贝
        int[] test1 = {1, 2, 3, 45, 5};
        int[] test2 = new int[3];
        test2 = Arrays.copyOfRange(test1, 3, 5);
        System.out.println(Arrays.toString(test2));
    }
}
