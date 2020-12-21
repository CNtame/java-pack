package com.pack.java.enumJava;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/19
 */
public enum  EnumExample {
    /**
     * 申请借阅卷宗
     */
    APPLY_BORROW(0),
    APPLY_PASS( 1),
    APPLY_NOT_PASS(2);

    private int index;

    private EnumExample(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
