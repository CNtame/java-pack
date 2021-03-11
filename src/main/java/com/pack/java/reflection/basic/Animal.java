package com.pack.java.reflection.basic;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/11
 */
public abstract class Animal implements Eating{

    public static String CATEGORY = "small";

    private String name;


    protected abstract String getSound();


    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public static String getCATEGORY() {
        return CATEGORY;
    }

    public String getName() {
        return name;
    }

    public static void setCATEGORY(String CATEGORY) {
        Animal.CATEGORY = CATEGORY;
    }

    public void setName(String name) {
        this.name = name;
    }
}
