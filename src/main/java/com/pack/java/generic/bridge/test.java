package com.pack.java.generic.bridge;

import java.lang.reflect.Method;

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
        Object d = "1";
        //parent.setSecond(d);
        test(Child.class);
    }

    public static boolean test(Class c) {
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            if (method.isSynthetic() || method.isBridge()) {
                System.out.println("Method Name = "+method.getName());
                System.out.println("Method isBridge = "+method.isBridge());
                System.out.println("Method isSynthetic = "+method.isSynthetic());
                return  true;
            }
            // More code.
        }
        return false;

    }
}
