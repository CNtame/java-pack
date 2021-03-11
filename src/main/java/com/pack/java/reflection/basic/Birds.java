package com.pack.java.reflection.basic;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/11
 */
public class Birds extends Animal {

    private boolean walks;

    @Override
    public String eatFoods() {
        return "null";
    }

    @Override
    protected String getSound() {
        return "jiji";
    }

    public Birds(String name) {
        super(name);
    }

    public Birds() {
        super("birds");
    }

    public Birds(String name, boolean walks) {
        super(name);
        this.walks = walks;

    }

    public void setWalks(boolean walks) {
        this.walks = walks;
    }

    public boolean isWalks() {
        return walks;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name:"+getName()+
                "walks=" + walks +
                '}';
    }
}
