package com.example.rclack.spring.day1108;

import com.example.rclack.spring.day1108.bean.Dog;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;
import java.util.stream.Stream;

public class BeanFactoryDemo {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("day1108/catAndDog.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        //
        System.out.println("加载xml文件后容器中的bean：");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println();
        beanFactory.registerSingleton("doggg", new Dog());
        //
        System.out.println("手动注册单实例Bean后容器中所有Bean：");
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);

        //
        System.out.println("容器中真的有注册Dog：" + beanFactory.getBean("doggg"));
        System.out.println("容器中的所有Dog：" + Arrays.toString(beanFactory.getBeanNamesForType(Dog.class)));
    }

}
