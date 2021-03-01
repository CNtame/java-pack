package com.pack.java.dataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2020/11/16
 */
public class Hash {


    public static void main(String[] args) {


        /**
         * String
         *
         */
        System.out.println("11".hashCode());


        /*
        hashMap
         */
        Map<Integer, Integer> data = new HashMap<>(15);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }

        for (int x : nums) {
            int count = data.getOrDefault(x, 0) + 1;
            data.put(x, count);
        }

    }
}
