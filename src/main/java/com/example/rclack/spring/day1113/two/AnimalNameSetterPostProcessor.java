package com.example.rclack.spring.day1113.two;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

//@Component
public class AnimalNameSetterPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("DogRegisterPostProcessor postProcessBeanFactory run ......");
        String[] animalNames = beanFactory.getBeanNamesForType(Animal.class);
        Stream.of(animalNames).forEach(name -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            beanDefinition.getPropertyValues().add("name", name);
        });
    }
}