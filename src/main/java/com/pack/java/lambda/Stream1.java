package com.pack.java.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/12/29
 */
public class Stream1 {

    public static void main(String[] args) {

        /*
        惰性求值：输出的还是流

        及早求值：输出的是不是流
        collect、
         */

        /*
        collect
         */
        List<User> users = Stream.of(new User("test1", 10),
                new User("test2", 11),
                new User("test3", 25)).collect(Collectors.toList());
        System.out.println(users);

        /*
        filter 内部就是一个Predicate接口
         */
        List<User> userList=users.stream().filter(s->s.getAge()>18)
                .collect(Collectors.toList());
        System.out.println("学生大于18岁：" + userList);

        /*
        map 内部相当于Function接口
         */
        List<String> names = users.stream()
                .map(s -> s.getUserName())
                .collect(Collectors.toList());
        System.out.println("用户的姓名：" + names);

        /*
        flatMap
        将多个stream合并为一个Stream
        惰性求值
         */
        List<String> datas = new ArrayList<>();
        datas.add("asdsaf");
        datas.add("dfgfer");
        List<String> datas1 = datas.stream()
                .map(s->s.split(""))
                .flatMap(st-> Arrays.stream(st))
                .collect(Collectors.toList());
        System.out.println("flatMap流扁平化："+datas1);

        /*
        max 、min
        及早求值
         */
        Optional<User> max = users.stream()
                .max(Comparator.comparing(s -> s.getAge()));
        Optional<User> min = users.stream()
                .min(Comparator.comparing(s -> s.getAge()));
        System.out.println("用户门年龄最小值：" + min);
        if (max.isPresent()) {
            System.out.println("用户们年龄最大值：" + max);
        }

        /*
        count
        先筛选出我们需要的再统计
        及早求值
         */
        Long count = users.stream()
                .filter(s -> s.getAge() > 18).count();
        System.out.println("年龄大于18岁的个数：" + count);

        /*
        reduce
        可以从一组数求出一个值：比如求和
        及早求值
         */
        Integer countAges = users.stream()
                .map(s -> s.getAge()).reduce(0, (acc, x) -> acc + x);
        System.out.println("人的年龄总数：" + countAges);




    }
}
