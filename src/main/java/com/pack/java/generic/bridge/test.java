package com.pack.java.generic.bridge;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class test {


    public static void main(String[] args) {
        Parent<String> parent = new Child();
        parent.setFirst("11");
        parent.setSecond("1");
        System.out.println("参数2："+parent.getParam2());
        parent.setSecond("111");
        System.out.println("参数2："+parent.getParam2());

    }
}
