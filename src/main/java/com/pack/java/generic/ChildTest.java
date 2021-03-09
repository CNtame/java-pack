package com.pack.java.generic;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class ChildTest implements ParentTest<String> {


    public String bridgeMethod(String param) {
        return param;
    }
}
