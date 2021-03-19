package com.pack.java.mutiThread.achievement;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/19
 */
public class ByThread extends Thread{

    @Override
    public void run() {
        System.out.println("Current thread name: "
                + Thread.currentThread().getName());

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
        System.out.println("run()被调用");

    }
}
