package com.pack.java.javaNew;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/8
 */
public class JavaStream {


    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6};
        String[] dataString = new String[]{"1", "2", "3"};

        //打印数组
        System.out.println(Arrays.toString(data));
        System.out.println(data);
        /*
        升序
         */
        Arrays.sort(data);

        int[][] data2 = {{1, 2}, {2, 3}, {2, 4}, {2, 1}};
        Arrays.sort(data2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o1[1]-o2[1];
                else return o1[0]-o2[0];
            }
        });
        System.out.println(Arrays.deepToString(data2));

        /*
        对于基本类型的数组排序，是无法重写Comparator来排序的，这是因为基本类型不是Object
         */
        //Arrays.sort(data, new Comparator<Integer>() {
        //
        //    @Override
        //    public int compare(Integer o1, Integer o2) {
        //        return 0;
        //    }
        //});
        java.util.PriorityQueue<int[]> datas = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1!=o2? o2[0]-o1[0]:o2[1]-o1[1];
            }
        });






        Integer[] data3 = new Integer[]{1, 2, 3, 4, 5, 6};
        /*
        升序
        <47插入排序
       >=47&&<286 快排
       >286归并排序
         */
        Arrays.sort(data3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(02);
            }
        });

        System.out.println(Arrays.toString(data3));
        //降序
        Arrays.sort(data3,(a,b)->{return b.compareTo(a);});
        Arrays.sort(data3,Comparator.reverseOrder());

        System.out.println(Arrays.toString(data3));
        //新建比较类
        Arrays.sort(data3,new Comparators<>());
        System.out.println(Arrays.toString(data3));






    }
}
