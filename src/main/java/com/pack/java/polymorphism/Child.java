package com.pack.java.polymorphism;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/9
 */
public class Child extends Parent {

    private String param3;

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }



    public Child(Integer param1,Integer param2,String param3) {
        super(param1, param2);
        this.param3 = param3;
    }

    @Override
    public void setParam2(Integer param2) {
        super.setParam2(param2*2);
    }

    public void setParam2(Object o) {
        super.setParam2((Integer) o);
    }
}
