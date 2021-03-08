package com.pack.java.annotation.metaAnnotation.InheritedAnnotation;

import java.lang.annotation.*;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/6
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedAnnotation {
}
