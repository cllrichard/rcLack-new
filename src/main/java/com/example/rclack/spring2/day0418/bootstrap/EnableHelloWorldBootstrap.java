package com.example.rclack.spring2.day0418.bootstrap;

import com.example.rclack.spring2.day0418.annotation.EnableHelloWorld;
import com.example.rclack.spring2.day0418.configuration.HelloWorldConfiguration;
import com.example.rclack.spring2.day0418.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);

        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("HelloWorldConfiguration is Bean :" + helloWorld);

        context.close();
    }
}
