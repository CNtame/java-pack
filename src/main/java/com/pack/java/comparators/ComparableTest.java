package com.pack.java.comparators;

import com.pack.java.dataStructure.Collection;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/28
 */
public class ComparableTest {


    public static void main(String[] args) {

        Integer a = 1;
        System.out.println(a.compareTo(2));
        System.out.println(Integer.compare(a, 2));


        int[] iData = new int[]{934, 23, 1111, 32};

        /*
         * Arrays sort()默认升序排序
         */
        Arrays.sort(iData);
        System.out.println("Arrays 中sort默认升序排序：" + Arrays.toString(iData));

        /*
        arrays工具类中sort方法：传递Comparator实现类
         */
        Integer[] iData2 = new Integer[]{123, 442, 564, 1, 5, 54};
        Arrays.sort(iData2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) return -1;
                if (o1.equals(o2)) return 0;
                else return 1;
            }
        });
        System.out.println("Arrays中sort自己制定排序规则：" + Arrays.toString(iData2));


        List<Integer> data = Arrays.asList(1, 2, 3, 56, 23);

        /*
         * 使用collections 工具类中sort方法 进行排序
         * 接收参数Comparable，
         * 调用了list接口默认方法sort
         * 接收参数是：sort(Comparator<? super E> c) collection传递的是null值。
         * 将数据转换为数组，调用Arrays工具类中sort方法，
         * 接收参数：T[] a, Comparator<? super T> c
         * 因为c为null，有转到了Arrays类另外一个sort（）方法
         */
        Collections.sort(data);
        System.out.println("collections中sort方法"+data);

        Collections.sort(data,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) return -1;
                if (o1.equals(o2)) return 0;
                else return 1;
            }
        });
        System.out.println("Collection中sort自定义规则排序："+data);

        /*
         * 使用List接口中默认方法进行排序
         * 传递的是实现接口Comparator,实现compare方法
         *
         */
        data.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2) return -1;
                if (o1.equals(o2)) return 0;
                else return 1;
            }
        });
        System.out.println("List接口中Comparator方法："+data);

    }
}
