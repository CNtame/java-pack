package com.pack.java.lang.cloneable;

import lombok.Data;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
@Data
public class User implements Cloneable{

    private String userName;

    private String password;

    private Role role;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
