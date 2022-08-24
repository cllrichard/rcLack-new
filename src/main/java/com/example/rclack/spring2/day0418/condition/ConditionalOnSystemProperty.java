package com.example.rclack.spring2.day0418.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 条件判断
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    String name();

    String value();

}
