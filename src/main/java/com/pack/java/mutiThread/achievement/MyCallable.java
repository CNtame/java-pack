package com.pack.java.mutiThread.achievement;

import java.util.concurrent.Callable;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/19
 */
public class MyCallable implements Callable<String> {

    private static int num=10;

    @Override
    public String call() throws Exception {
        System.out.println("Current thread name: "
                + Thread.currentThread().getName());
        System.out.println("MyCallable被调用");

        return "success"+num--;
    }
}
