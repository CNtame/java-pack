package com.pack.java.dataStructure;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/16
 */
public class Collection {

    public static void main(String[] args) {

        collections();

    }

    public static void collections() {
        /*
        List<> 接口继承了collection接口
        ArrayList继承实现了List
         */
        List<Integer> datas = new ArrayList<>();
        datas.add(1);
        datas.add(1, 2);
        System.out.println("index1:" + datas.get(1));
        /*
        collection接口方法
         */
        datas.add(2);
        List<Integer> insert = new ArrayList<>();
        insert.add(6);
        datas.addAll(insert);
        datas.addAll(3, insert);
        System.out.println("size:" + datas.size());
        System.out.println("whether is Empty:" + datas.isEmpty());
        /*
        hashcode
        equals
         */
        List<Integer> data1 = new ArrayList<>();
        data1 = datas;
        //data1与datas的hashcode:true
        //data1与datas相等吗？true
        System.out.println("data1与datas的hashcode:" + (data1.hashCode() == datas.hashCode()));
        System.out.println("data1与datas相等吗？" + data1.equals(datas));
        /*
        collection继承Iterator接口
        实现Iterator类可以使用增强for循环
         */
        for(int data:datas){
            System.out.print(data);
        }
        System.out.println();
        /*
        Iterator
        hasNext()、next()、remove()、
         */
        //如果只是读、不如写成foreach
        Iterator<Integer> itr = datas.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }
        //remove方法：找到项，然后删除开销小
        /*
        当直接使用Iterator进行add、remove、clear方法，迭代器不合法，
        如果调用迭代器自己的remove方法，这是合法的
         */
        List<Integer> eg = new ArrayList<>(datas);


        //list转数组注意
        /*
        toArray()
         */
        Integer[] array=datas.toArray(new Integer[0]);
        System.out.println("\n"+Arrays.toString(array));








    }







}
