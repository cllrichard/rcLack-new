package com.example.rclack.spring3.day1015;

import com.example.rclack.model.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class BeanDefinitionCreationDemo {


    public static void main(String[] args) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        beanDefinitionBuilder.addPropertyValue("id", "12");
        //获取
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        // 通过 AbstractBeanDefinition
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(User.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("id", "value").add("id", "value");
        genericBeanDefinition.setPropertyValues(propertyValues);



    }
}
