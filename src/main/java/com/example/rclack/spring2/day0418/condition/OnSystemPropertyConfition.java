package com.example.rclack.spring2.day0418.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String propertyName = String.valueOf(annotationAttributes.get("name"));

        String propertyValue = String.valueOf(annotationAttributes.get("value"));

        String javaPropertyValue = System.getProperty(propertyName); //这个获取电脑名称可以用其他条件进行判断

        return propertyValue.equals(javaPropertyValue);
    }
}
