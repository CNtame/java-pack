package com.pack.java.basicData;

import javax.swing.table.TableCellEditor;
import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/25
 */
public class StringTest {


    public static void main(String[] args) {

        String data = "123";

        System.out.println("\"123\"中index0："+data.charAt(0));

        /*
         * compareTo -1、0、1
         */
        System.out.println("\"122\"与\"123\"compareTo()" + "122".compareTo(data));

        /*
        concat:使用Arrays.copyOf()

         */
        String s1 = "hello";
        s1.concat(" word.");
        System.out.println(s1);
        s1 = s1.concat(" world.");
        System.out.println(s1);

        /*
        contains
         */
        String name = "My name is abe.";
        System.out.println("name字符串包含\"my\":"+name.contains("my"));
        System.out.println("name字符串包含\"My\":"+name.contains("My"));

        /*
        endsWith
         */
        System.out.println(name.endsWith("abe"));
        System.out.println(name.endsWith("abe."));

        /*
        equals 与==

         */
        String e1 = "123";
        String e2 = "123";
        System.out.println(":" + e1 == e2);
        System.out.println("equals:" + e1.equals(e2));

        String e3 = "123";
        String e4 = e3;
        System.out.println("e3==e4:" + e3 == e4);
        System.out.println("e3与e4：" + e3.equals(e4));

        /*
        getBytes()
         */
        String b1 = "ABCDEFG";
        String b2 = "abcde";
        byte[] bs1 = b1.getBytes();
        byte[] bs2 = b2.getBytes();
        for (byte b : bs1) {
            System.out.print(b + "-");
        }
        System.out.println();
        for (byte b : bs2) {
            System.out.print(b + "-");
        }
        System.out.println();

        System.out.println(new String(b1));

        /*
        getChars():
         */
        try {
            String g1 = "test hello java!";
            char[] ch = new char[20];
            //srcEnd:不包括此index
            //char[]长度要满足 大于等于复制char的长度
            //srcEnd不等大于g1length
            g1.getChars(0, g1.length(), ch, 0);
            System.out.println("g1->ch[]"+Arrays.toString(ch));

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        /*
         * indexOf()
         */




        char[] trans = data.toCharArray();
        System.out.println("string->char[]:" + Arrays.toString(trans));

        System.out.println(String.join("-","a"));

        System.out.println(String.join("-", "a", "b"));

        //System.out.println(String.join('-','a','b'));



    }
}
