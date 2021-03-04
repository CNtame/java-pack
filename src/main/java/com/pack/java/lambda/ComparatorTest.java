package com.pack.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/2
 */
public class ComparatorTest {

    public static void main(String[] args) {
        /*
         * lambda表达式
         * 实现comparator接口自定义规则排序
         */
        List<String> data = Arrays.asList("1", "2213", "612123");

        System.out.println("原数据：" + data);
        data.sort((a, b) -> b.length() - a.length());
        System.out.println("排序后：" + data);

        List<Integer> nums = Arrays.asList(1, 213, 12312, 12);
        System.out.println("原数据：" + nums);
        nums.sort((a, b) -> b - a);
        System.out.println("排序后：" + nums);

        /*
         * 更深方法使用lambda+Predicate接口
         */
        List<Integer> d = Arrays.asList(1, 2, 122, 4, 5, 34);
        evaluate(d, (n) -> n > 2);


        /*
         * 方法引用
         */

        /*
         * 对象 实例方法
         * object::instanceMethod
         */
        Judge judge = new Judge();
        evaluate(d, judge::judge2);

        //Class::instanceMethod


        //Class::staticMethod
        evaluate(d, Judge::judge);

        /*
        多个参数
         */
        int sum=sum(d, Judge::num1);
        System.out.println("方法引用计算List总数："+sum);
        int sum1 = sum(d, (a, b) -> a + b);
        System.out.println("()lambda计算总数：" + sum1);

        /*
        流处理 里面其实呢也是BinaryOperator接口
         */
        long sum2 = d.stream().reduce(0, Integer::sum);
        System.out.println("流式sum：" + sum2);



        //以上看来流处理哪些为我们提前写好了一些方法，可以直接使用


    }

    /**
     * Predicate 与lambda表达式结合使用
     * @param data
     * @param predicate
     */
    private static void evaluate(List<Integer> data, Predicate<Integer> predicate) {
        System.out.print("List中大于2的数:");
        for (Integer n : data) {
            if (predicate.test(n)) {
                System.out.print(n+ " ");
            }
        }
        System.out.println();

    }

    private  void evaluate2(List<Integer> data, Predicate<Integer> predicate) {
        for (Integer n : data) {
            if (predicate.test(n)) {
                System.out.print(n+ " ");
            }
        }
        System.out.println();

    }

    private static int sum(List<Integer> data, BinaryOperator<Integer> binaryOperator) {
        int res = 0;
        for (Integer n : data) {
            res = binaryOperator.apply(res, n);
        }

        return res;

    }
}
