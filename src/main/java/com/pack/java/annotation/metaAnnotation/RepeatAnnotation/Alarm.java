package com.pack.java.annotation.metaAnnotation.RepeatAnnotation;


import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author liu
 * @version 1.0
 * @description
 * @createDate 2021/3/8
 */
@RepeatAnnotation(time = "09:00")
@RepeatAnnotation(time = "19:00")
public class Alarm {
}
