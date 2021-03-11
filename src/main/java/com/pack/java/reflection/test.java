package com.pack.java.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.*;

/**
 * @author liu
 * @version 1.0
 * @description 反射
 * @createDate 2021/3/11
 */
public class test {

    public static void main(String[] args) {
        Object user = new User();
        Field[] fields = user.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFieldNames(fields);
        System.out.println(actualFieldNames);
        //assert (Arrays.asList("userName", "phone", "age").containsAll(actualFieldNames));
    }

    private static List<String> getFieldNames(Field[] fields) {
        List<String> res = new ArrayList<>();

        for (Field field : fields) {
            res.add(field.getName());

        }
        return res;
    }
}
