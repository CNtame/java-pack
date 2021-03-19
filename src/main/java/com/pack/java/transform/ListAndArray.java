package com.pack.java.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/19
 */
public class ListAndArray {

    public static void main(String[] args) {


        /*
         * 数组转List
         */
        Integer[] dataTo = new Integer[]{1, 2, 3};
        List<Integer> arrays =  Arrays.asList(dataTo);

        /*

        这不是最好的，因为asList()返回的列表的大小是固定的。
        事实上，返回的列表不是java.util.ArrayList，
        而是定义在java.util.Arrays中一个私有静态类。
        我们知道ArrayList的实现本质上是一个数组，而asList()返回的列表是由原始数组支持的固定大小的列表。
        这种情况下，如果添加或删除列表中的元素，程序会抛出异常UnsupportedOperationException。

        res:Exception in thread "main" java.lang.UnsupportedOperationException
         */
        //arrays.remove(0);
        System.out.println(arrays);
        //////////////////////////////////////////
        List<Integer> array1 = new ArrayList<>(Arrays.asList(dataTo));
        array1.remove(0);
        System.out.println("Arrays.asList(dataTo)变种："+array1);

        /////////////////////////////
        List<Integer> array2 = new ArrayList<>(dataTo.length);
        Collections.addAll(array2, dataTo);
        array2.remove(0);
        System.out.println("collections:"+array2);

        /*
         * array 转list
         */




    }
}
