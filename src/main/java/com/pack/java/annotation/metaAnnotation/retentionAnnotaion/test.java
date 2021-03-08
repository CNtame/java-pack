package com.pack.java.annotation.metaAnnotation.retentionAnnotaion;

import java.lang.annotation.Annotation;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/6
 */
public class test {


    public static void main(String[] args) {
        UseAnnotation useAnnotation = new UseAnnotation();
        Annotation[] annotations = useAnnotation.getClass().getAnnotations();
        //-UserAnnoation中有几个注解正在运行的 1
        System.out.println("-UserAnnoation中有几个注解正在运行的 " + annotations.length);
    }
}
