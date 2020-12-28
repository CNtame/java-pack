package com.pack.java.dataStructure;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liu
 * @version 1.0
 * @description 数组
 * @createDate 2020/11/16
 */
public class Array {

    public static void main(String[] args) {

        sortArray();
    }

    /**
     * 数组排序
     */
    public static void sortArray() {


        /*
         * 数组排序 方法1
         */
        int[][] data =new int[][]{{2,2},{2,1}};
        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-(o1[0]);
            }
        });
        //多维数组打印失败
        System.out.println(Arrays.toString(data));
        Arrays.stream(data).map(Arrays::toString).forEach(System.out::println);

        int[][] data1 = new int[][]{{1, 2}, {2, 3}, {5, 3}, {9, 10}};
        Arrays.sort(data1, Comparator.comparingInt(a -> a[0]));
        Arrays.stream(data1).map(Arrays::toString).forEach(System.out::println);
    }
}
