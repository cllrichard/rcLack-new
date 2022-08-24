package com.example.rclack.spring2.day0418.bootstrap;

import com.example.rclack.spring2.day0418.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(value = "com.example.rclack.spring2.day0418.repository")
public class RepositoryBootstrap {


    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE).run(args);

        MyFirstLevelRepository myFirstLevelRepository = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("MyFirstLevelRepository is Bean :" + myFirstLevelRepository);

        context.close();
    }

}
