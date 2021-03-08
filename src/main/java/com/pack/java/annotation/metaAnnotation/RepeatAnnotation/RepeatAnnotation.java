package com.pack.java.annotation.metaAnnotation.RepeatAnnotation;

import java.lang.annotation.Repeatable;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/8
 */
@Repeatable(RepeatAnnotations.class)
public @interface RepeatAnnotation {
    String time() default "00:00";

}
