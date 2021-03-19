package com.pack.java.basicData.difference;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/17
 */
public class StringTest {


    public static void main(String[] args) {

        /*
         * String 与StringBuffer、StringBuilder的不同
         */

        String data = "123";
        String data1 = data;
        //这又赋值了一个新对象
        data1 = "32";
        System.out.println("data:" + data);
        System.out.println("data1:" + data1);

        StringBuilder data2 = new StringBuilder("123");
        //引用的还是同一个对象
        StringBuilder data3 = data2;
        data3.append('3');
        System.out.println("data2:"+data2);
        System.out.println("data3:" + data3);
    }
}
