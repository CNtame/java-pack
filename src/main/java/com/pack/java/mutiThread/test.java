package com.pack.java.mutiThread;

import com.pack.java.mutiThread.achievement.ByThread;
import com.pack.java.mutiThread.achievement.MyCallable;
import com.pack.java.mutiThread.achievement.MyRunnable;
import com.pack.java.mutiThread.achievement.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/19
 */
public class test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        start区别 与run区别
         */
        /*
        Current thread name: Thread-0
        创建了一个新线程、执行run方法在一个新线程
        注：不能请求start()两次 throws java.lang.IllegalStateException
         */
        ByThread myThread = new ByThread();
        myThread.start();

        /*
        Current thread name: main
        没有创建新线程、还是和main一个线程同步运行 、执行run方法和被请求的线程一样
        注：可以多次请求引用run()
         */
        ByThread thread = new ByThread();
        thread.run();


        /*
         * runnable 创建线程
         */
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();


        /*
         * callable 创建线程 覆写方法 会有返回值
         * FutureTask 接收返回值
         */
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread3 = new Thread(futureTask);
        thread3.start();
        System.out.println(futureTask.get());


        /*
         * 线程池
         * 判断线程池是否允许
         * 线程数小于核心数：count<corePoolSize，添加线程并工作
         * 线程数大于核心数：查看阻塞队列
         * count>=corePoolSize,且阻塞队列未满，放入阻塞队列中
         * 如果阻塞队列已满，查看
         *
         * 线程池线程数是否大于maximumPoolSize，如果大于则抛弃。否则添加线程工作
         * count>=corePoolSize && count<maximumPoolSize,队列已满，则创建线程
         * count>=maximumPoolSize,抛弃队列
         */
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            ThreadPool pool = new ThreadPool();
            executorService.execute(pool);
        }


    }
}
