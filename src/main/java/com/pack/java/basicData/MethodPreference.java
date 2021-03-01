package com.pack.java.basicData;

import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/22
 */
public class MethodPreference {


    public static void main(String[] args) {

        //方法不能改变基本类型变量的参数
        int i=2;
        BasicParams(i);
        System.out.println(i);

        /*
        方法可以改变对象的参数类型，但是
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
        classParam(object);
        System.out.println(object.getMoney());

        /*
         * 方法无法改变对象整体引用
         * 比如对象交换，重新替换一个新对象
         */
        TestObject object2 = new TestObject("test", 51);
        changeClass(object2);
        System.out.println(object2.toString());

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
     * 方法参数：引用类型数组，数组元是基础类型
     * 增强型for循环失败
     * 增强型for循环中重新定义一个基础类型，值是原数组的值，但已经不属于数组本身了
     * @param nums
     */
    private static void arrayParams(int[] nums) {
        for (int num : nums) {
            num = num * num;
        }
    }

    /**
     * 方法参数：引用型类型-数组
     * for普通遍历
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
     * 方法参数：引用型类型-类
     *
     */
    private static void classParam(TestObject object) {
        object.raiseMoney(10);

    }

    /**
     * 方法参数：对象类
     * 修改对象参数中的一些实例字段
     */
    private static void classParam2(TestObject object) {
        object.setMoney(200);

    }

    /**
     * 方法参数：对象
     * 对象参数不能换成另外一个新对象
     * 换句话说：如果你要操控整体对象，不可能的。内存中的地址是不会发生变化的
     */
    private static void changeClass(TestObject object) {

        //新建的副本对象
        object = new TestObject("111", 222);
    }
}
