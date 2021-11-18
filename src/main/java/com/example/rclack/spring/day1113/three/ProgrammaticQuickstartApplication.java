package com.example.rclack.spring.day1113.three;

import com.example.rclack.spring.day1113.three.bean.Person;
import com.example.rclack.spring.day1113.three.bean.PersonConfiguration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammaticQuickstartApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
        ctx.registerBeanDefinition("person", personDefinition);
        ctx.refresh();
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
    }
}
