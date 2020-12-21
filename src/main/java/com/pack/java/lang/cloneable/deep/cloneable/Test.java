package com.pack.java.lang.cloneable.deep.cloneable;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        深拷贝
        每一层都要实现Cloneable接口并覆盖clone方法
         */
        User user = new User();
        user.setUserName("liu");
        user.setPassword("12345");
        Menu menu = new Menu();
        menu.setMenuName("菜单1");
        user.setMenu(menu);

        User user1 = (User) user.clone();
        user1.getMenu().setMenuName("菜单2");
        System.out.println("元数据：" + user);
        System.out.println("cloneable:" + user1);
    }
}
