package com.pack.java.mutiThread.achievement;

/**
 * @author liu
 * @version 1.0
 * @description 线程池
 * @createDate 2021/3/19
 */
public class ThreadPool implements Runnable{


    private int num = 3;

    @Override
    public void run() {
        System.out.println("线程池：");
        for (int i = 0; i < num; i++) {
            System.out.println("线程" + Thread.currentThread() + "  " + i);
        }
    }
}
