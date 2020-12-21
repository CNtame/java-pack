package com.pack.java.javaNew;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/10
 */
public class JavaArraysMethods {


    public static void main(String[] args) {

        //数组打印字符串：Arrays.toString()\Arrays.deepToString()
        int[][] data = new int[][]{{1, 2, 3, 4}, {4, 5, 6, 7}, {43, 134, 4, 5}};
        System.out.println(Arrays.deepToString(data));

        /*
        List打印字符串
         */
        List<List<List<Integer>>> datas = new ArrayList<>();
        for(int i=0;i<3;i++){
            List<List<Integer>> data1 = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                List<Integer> data11 = new ArrayList<>();
                data11.add(j);
                data11.add(2 * j);
                data1.add(data11);
            }
            datas.add(data1);
        }
        System.out.println(datas);

    }
}
