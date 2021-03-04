package com.pack.java.basicData;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/2/22
 */
public class TestObject {

    private String userName;

    private int money;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void raiseMoney(int num) {
        this.money *= num;

    }

    public TestObject(String userName, int money) {
        this.userName = userName;
        this.money = money;

    }

    @Override
    public String toString() {
        return "TestObject{" +
                "userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
