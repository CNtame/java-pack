package com.pack.java.mutiThread.achievement;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/19
 */
public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("Current thread name: "
                + Thread.currentThread().getName());
        System.out.println("MyRunnable被调用");
    }
}
