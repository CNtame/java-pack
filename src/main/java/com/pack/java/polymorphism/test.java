package com.pack.java.polymorphism;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class test {


    public static void main(String[] args) {
        Child child=new Child(2,4,"5");
        Parent parent = child;
        child.setParam3("8");

        //多态
        parent.setParam2(2);
        System.out.println("parent中param2:参数："+parent.getParam2());

        //重载
        child.setParam2(3);
        System.out.println("child中param2:参数："+child.getParam2());
    }
}
