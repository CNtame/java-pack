package com.pack.java.annotation.metaAnnotation.functionAnnotation;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/8
 */
public class FunctionAnTest {

    public static void main(String[] args) {
        Adder adder = Integer::sum;
        System.out.println(adder.add(1, 2));
    }
}
