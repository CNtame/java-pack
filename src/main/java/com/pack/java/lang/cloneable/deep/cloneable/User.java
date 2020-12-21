package com.pack.java.lang.cloneable.deep.cloneable;

import lombok.Data;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
@Data
public class User implements Cloneable {

    private String userName;

    private String password;

    private Menu menu;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Menu menu = ((User) object).getMenu();
        menu = (Menu) menu.clone();
        ((User) object).setMenu(menu);
        return object;
    }
}
