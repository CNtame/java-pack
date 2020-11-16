package com.pack.java.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/14
 */
public class FileActionRead {


    public static void main(String[] args) {
        /**
         * 字符流读取文件char
         */
        System.out.println(readFile());
        /**
         * 字符流读取
         */
        System.out.println(charReadFile());

        /**
         * 字节流读取纯英文数字
         */
        System.out.println(byteRead1());

        /*
        字节流读取汉英交杂
        乱码
         */
        System.out.println(byteRead2());

        /**
         * 缓冲流读取数据
         */
        System.out.println(bufferReader());

    }

    /**
     * 字符流读取文件
     * BufferReader
     * @return
     */
    public static String readFile() {
        File file = new File("/Users/liuhaibo/Documents/data/word.txt");
        FileReader reader = null;
        BufferedReader buffer = null;
        StringBuilder res = new StringBuilder();
        try {
            if (file.exists()) {
                reader = new FileReader(file);
                buffer = new BufferedReader(reader);
                int data=0;
                while((data=buffer.read())!=-1){
                    res.append((char) data);
                }
                buffer.close();

            }
            return res.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 字符流读取
     * FileInputStream:字节流
     * InputStreamReader:是字节流与字符流之间的桥梁，
     * 能将字节流输出为字符流，并且能为字节流指定字符集，可输出一个个的字符；
     * @return
     */
    public static String charReadFile() {
        File file = new File("/Users/liuhaibo/Documents/data/word.txt");

        FileInputStream stream = null;
        InputStreamReader reader = null;
        StringBuilder res = new StringBuilder();
        try {
            if (file.exists()) {
                stream = new FileInputStream(file);
                //将字节流转换为字符流，并且制定编码为UTF-8
                reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
                int data = 0;
                while ((data = reader.read()) != -1) {
                    res.append((char) data);
                }
            }
            return res.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }

    /**
     * 字节流
     * 读取英文的话，用字节流，然后用(char)强制转化一下就行了，
     * 但如果有中文等双字节语言或者说需要指定字符编码集的情况，
     * 就必须用到InputStreamReader将字节流转化为字符流了。
     */
    public static String byteRead1() {
        File file = new File("/Users/liuhaibo/Documents/data/word.txt");
        FileInputStream stream = null;
        StringBuilder res = new StringBuilder();
        try {
            stream = new FileInputStream(file);
            int data = 0;
            while ((data = stream.read()) != -1) {
                res.append((char) data);
            }
            stream.close();
            return res.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return res.toString();
        } catch (IOException e) {
            return "";
        }
    }

    /**
     * 字节流读取 只适合英语和数组
     * 汉字中文出错
     */
    public static String byteRead2() {
        File file = new File("/Users/liuhaibo/Documents/data/word2.txt");
        FileInputStream stream = null;
        StringBuilder res = new StringBuilder();
        try {
            stream = new FileInputStream(file);
            int data = 0;
            while ((data = stream.read()) != -1) {
                res.append((char) data);
            }
            stream.close();
            return res.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return res.toString();
        } catch (IOException e) {
            return "";
        }
    }

    /**
     * bufferReader缓冲字字符流
     * 可以通过BufferReader来缓存数据，快速获取网络数据
     */
    public static String bufferReader() {
        File file = new File("/Users/liuhaibo/Documents/data/word2.txt");
        FileInputStream stream=null;
        InputStreamReader reader=null;
        BufferedReader buffer=null;
        StringBuilder res = new StringBuilder();
        try {
            if (file.exists()) {
                stream = new FileInputStream(file);
                reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
                buffer = new BufferedReader(reader);
                int data = 0;

                while ((data = buffer.read()) != -1) {
                    res.append((char) data);
                }
            }
            return res.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }

    /**
     * 字节流 行读取
     */

}
