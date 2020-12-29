package com.pack.java.lambda;

import java.util.function.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/29
 */
public class test {

    public static void main(String[] args) {

        /*
        Predicate    test
        数据是否符合条件
        输出Boolean
         */
        Predicate<Integer> predicate = x -> x > 15;
        User user = new User("test", 15);
        System.out.println("test的年龄高于15吗？" + predicate.test(user.getAge()));

        /*
        Consumer accept
        获取所需数据后打印
         */
        Consumer<User> consumer = x -> {
            System.out.println(x.getUserName() + "的年龄：" + x.getAge());
        };
        consumer.accept(user);


        /*
        Function apply
        数据转换
        输入类型可以和输出类型不一样
         */
        Function<User, String> function = User::getUserName;
        System.out.println(function.apply(user));

        /*
         * Supplier get
         * 固定数据
         * 输出
         */
        Supplier<String> supplier = () -> {
            return "测试数据";
        };
        System.out.println(supplier.get());

        /*
        UnaryOperator apply
        转换数据
        不过输入、输出数据类型一样
         */
        UnaryOperator<String> unaryOperator = x -> {
            return x + "1";
        };
        unaryOperator.apply("测试数据");

        /*
        多元
        转换数据
        不过输入、输出数据类型一样
        输入数据两个,两个都一样类型
         */
        BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
        Integer res = binaryOperator.apply(1, 3);
        System.out.println(res);

    }
}
