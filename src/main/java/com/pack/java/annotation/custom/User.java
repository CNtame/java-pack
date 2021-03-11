package com.pack.java.annotation.custom;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/11
 */
@ClassAnnotation
public class User {


    @FieldAnnotation
    private String userName;

    @FieldAnnotation
    private String phoneNum;

    @FieldAnnotation(key = "12313")
    private String departmentName;

    private Integer age;
}
