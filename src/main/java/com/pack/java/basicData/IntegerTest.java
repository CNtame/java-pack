package com.pack.java.basicData;

import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/10
 */
public class IntegerTest {

    public static void main(String[] args) {
        String data = "112";
        System.out.println("parseInt()方法"+Integer.parseInt(data));

        char[] numbers = data.toCharArray();
        for (char number : numbers) {
            System.out.println(number);
        }

        //+111: parseInt()方法：+111
        String plusData = "+111";
        System.out.println("+111: parseInt()方法："+plusData);

        //-111: parseInt()方法-111
        String minData = "-111";
        System.out.println("-111: parseInt()方法"+minData);

        //-111:parseUnsignedInt():111
        System.out.println("+111:parseUnsignedInt():" + Integer.parseUnsignedInt("+111"));

        //-111:parseUnsignedInt():错误
        //System.out.println("-111:parseUnsignedInt():" + Integer.parseUnsignedInt("-111"));


        System.out.println("");
        //toBinaryString():1110000
        System.out.println("toBinaryString():" + Integer.toBinaryString(112));

        //二进制1的个数
        System.out.println("bigCount():" + Integer.bitCount(112));

        /*
         * 反转
         */
        //reverse方法是二进制  按位反转  转为十进制
        //112:1110000二进制
        System.out.println("reverse()方法："+Integer.reverse(112));

        //reverseBytes 按照字节反转
        System.out.println("reverseBytes()方法："+Integer.reverseBytes(112));

        //1%2 remainderUnsigned():1
        System.out.println("1%2 remainderUnsigned():" + Integer.remainderUnsigned(1, 2));



    }
}
