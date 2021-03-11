package com.pack.java.reflection.basic;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/11
 */
public class Cat extends Animal implements Action {

    @Override
    protected String getSound() {
        return "miao";
    }

    @Override
    public String actionType() {
        return "walk";
    }

    @Override
    public String eatFoods() {
        return "anything";
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("cat");
    }
}
