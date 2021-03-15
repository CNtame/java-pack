package com.pack.java.basicData;

import java.util.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/15
 */
public class cycle {


    public static void main(String[] args) {

        ///////////////////////////////////////////
        int[] intData = new int[]{1, 2, 3};
        for (int a : intData) {
            a += 2;
        }
        System.out.println(Arrays.toString(intData));
        for (int i = 0; i < intData.length; i++) {
            intData[i] += 2;
        }
        System.out.println("int[] for循环遍历"+Arrays.toString(intData));

        ///////////////
        List<Integer> listData = Arrays.asList(1, 2, 3);
        System.out.println("for遍历List：");
        for (Integer listDatum : listData) {
            System.out.print(listDatum);

        }
        System.out.println();
        Iterator<Integer> iterator = listData.iterator();
        System.out.println("Iterator遍历List：");
        while (iterator.hasNext()) {
            //int d = iterator.next();
            System.out.print(iterator.next());

        }

        ////////////////////////////////////////////////////////
        Stack<Integer> stackData = new Stack<>();
        stackData.addAll(Arrays.asList(1, 2, 3));
        System.out.println("栈转为array" + Arrays.toString(stackData.toArray()));
        System.out.println("栈转为String" + stackData.toString());
        System.out.println("栈peek：" + stackData.peek());
        //最好不用vector里方法 List顺序last是栈头，first是栈尾部
        System.out.println("栈lastElement：" + stackData.lastElement());


        //for循环栈，从底部到头部顺序
        System.out.print("for循环栈：");
        for (Integer stackDatum : stackData) {
            System.out.print(stackDatum);
        }
        System.out.println();
        //Iterator循环栈，从底部到头部顺序
        Iterator<Integer> stackIterator = stackData.iterator();
        System.out.print("Iterator遍历栈：");
        while (stackIterator.hasNext()) {
            System.out.print(stackIterator.next());

        }
        System.out.println();
        //清空栈遍历
        System.out.print("清空栈遍历:");

        while (!stackData.isEmpty()) {
            System.out.print(stackData.pop());

        }
        System.out.println();
        ////////////////////////////
        //array加入队列 First index：0 、Last：index：length-1
        Deque<Integer> dequeData = new LinkedList<>(Arrays.asList(1, 2, 3));
        //Iterator循环
        Iterator<Integer> dequeIterator = dequeData.iterator();
        System.out.print("Iterator循环:");
        while (dequeIterator.hasNext()) {
            System.out.print(dequeIterator.next());
        }
        System.out.println();

        //当做栈
        System.out.print("循环 当做栈:");
        while (!dequeData.isEmpty()) {
            System.out.print(dequeData.removeFirst());

        }
        System.out.println();


        dequeData.addAll(Arrays.asList(1, 2, 3));
        System.out.print("循环 当做队列:");
        //当做队列
        while (!dequeData.isEmpty()) {
            System.out.print(dequeData.pollFirst());
        }
        System.out.println();


        //结果一样，因为deque中栈、队列中头 First一个位置。

        //Collections.copy();


    }
}
