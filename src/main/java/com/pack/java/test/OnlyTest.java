package com.pack.java.test;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.BlockingDeque;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/8
 */
public class OnlyTest {

    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();
        //Deque<Integer> data = new LinkedList<>();
        //StringBuilder d = new StringBuilder();
        //List<Integer> ddd = new ArrayList<>();
        //int[][] datas = new int[3][5];
        //System.out.println(datas.length);
        //char data = '+';
        //String dd = "213";
        //char[] d = dd.toCharArray();
        //System.out.println(Character.getNumericValue(data));
        //System.out.println((int) Math.pow(2, 3));
        //System.out.println('+');
        //System.out.println('-');
        //System.out.println('*');
        //System.out.println('/');


        System.out.println(1 ^ 0);
        PriorityQueue<Integer> data = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        data.add(1);
        data.add(3);
        System.out.println(data.poll());

        PriorityQueue<Integer> datas = new PriorityQueue<>();
        datas.add(3);
        datas.add(5);
        System.out.println(datas.poll());

        List<String> ddd = new ArrayList<>();
        //String[] dds = Arrays.asList();
        Scanner scanner = new Scanner(System.in);
        //while (scanner.hasNextInt()) {
        //    scanner.
        //}
        BigDecimal bigDecimal = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(3);
        BigDecimal decimal = bigDecimal.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP);

        System.out.println(decimal);
        System.out.println((double)1/2);






        //System.out.println(Math.round(2 / 3));

    }
}
