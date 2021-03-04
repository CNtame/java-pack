package com.pack.java.lang.cloneable.shallow;

import com.pack.java.lang.cloneable.shallow.Role;
import com.pack.java.lang.cloneable.shallow.User;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setUserName("liu");
        user.setPassword("123456");
        /*
        克隆user User必须实现cloneable接口，最好可见性提高为public
        eg：User 对象中全是基础类型，没有引用类型数据
         */
        User user1 = (User) user.clone();
        user1.setUserName("test");
        System.out.println("元数据："+user);
        System.out.println("克隆后修改用户名数据：" + user1);
        /*
        如果有类中类,clone的role对象还是指向原来的对象，
        当修改原来的值、clone的值，会同时发生改变，浅拷贝
        User中含有引用类型 ：Role对象
         */
        Role role = new Role();
        role.setRoleName("超级管理员");
        user.setRole(role);
        System.out.println("元数据：" + user);
        User user2 = (User) user.clone();
        user2.getRole().setRoleName("管理员");
        System.out.println("元数据：" + user);
        System.out.println("修改实体类数据后：" + user2);




    }
}
