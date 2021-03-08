package com.pack.java.annotation.metaAnnotation.InheritedAnnotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/6
 */
public class test {


    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        Annotation[] annotations = derivedClass.getClass().getAnnotations();
        /*
        DerivedClass里的注解运行时数量：1
        [@com.pack.java.annotation.metaAnnotation.InheritedAnnotation.InheritedAnnotation()]
         */
        System.out.println("DerivedClass里的注解运行时数量：" + annotations.length);
        System.out.println("DerivedClass里的运行时注解：" + Arrays.toString(annotations));

    }
}
