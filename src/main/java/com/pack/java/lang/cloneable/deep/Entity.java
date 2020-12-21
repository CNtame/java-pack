package com.pack.java.lang.cloneable.deep;

import com.pack.java.lang.cloneable.deep.cloneable.Menu;
import com.pack.java.lang.cloneable.deep.cloneable.User;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public class Entity {
    public static User newPrototypeInstance(){
        Menu menu = new Menu();
        menu.setMenuName("Home");

        User user = new User();
        user.setMenu(menu);
        user.setPassword("12345");
        user.setUserName("liu");

        return user;
    }

}
