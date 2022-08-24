package com.example.rclack.spring2.day0418.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);

        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld bean: " + helloWorld);

        context.close();
    }
}
