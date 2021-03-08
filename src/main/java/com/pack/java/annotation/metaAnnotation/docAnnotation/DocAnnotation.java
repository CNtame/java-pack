package com.pack.java.annotation.metaAnnotation.docAnnotation;

import java.lang.annotation.*;

/**
 * @author liu
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DocAnnotation {

    int value();
}
