package com.pack.java.methodHandle;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/14
 */
public class UserInfo {

    private String userName;

    private String email;

    private int age;

    public int size;

    public static String getAll() {
        return "11";
    }

    public static int calc(int a, int b) {
        return a + b;
    }

    public static int calc(int b,int... a) {

        for (int c : a) {
            b += c;
        }
        return b;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserInfo(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

    private String stringTest() {
        return "111";
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
