package com.pack.java.basicData;

import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/22
 */
public class paranms {


    public static void main(String[] args) {

        //方法不能改变基本类型变量的参数
        int i=2;
        BasicParams(i);
        System.out.println(i);

        /*
        引用类型：数组、对象接口
        引用类型作为方法的参数，可以改变参数的的大小
         */

        int[] a = new int[]{1, 2, 3, 4};
        arrayParams(a);
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{1, 2, 3, 4};
        arrayParams2(b);
        System.out.println(Arrays.toString(b));


        TestObject object = new TestObject("test", 51);
        doubleMoney(object);
        System.out.println(object.getMoney());

    }

    /**
     * 基本数据类型引用
     * i传递进去是一个副本
     * @param i
     */
    private static void BasicParams(int i) {

        i = i * i;
    }

    /**
     *
     * @param nums
     */
    private static void arrayParams(int[] nums) {
        for (int num : nums) {
            num = num * num;
        }
    }

    /**
     * 可以
     *
     * @param nums
     */
    private static void arrayParams2(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            nums[i]*=nums[i];
        }
    }

    /**
     * 对象引用
     */
    private static void doubleMoney(TestObject object) {
        object.raiseMoney(10);

    }
}
