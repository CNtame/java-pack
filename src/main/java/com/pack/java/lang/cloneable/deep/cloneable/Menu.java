package com.pack.java.lang.cloneable.deep;

import lombok.Data;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
@Data
public class Menu implements Cloneable {


    private String menuName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
