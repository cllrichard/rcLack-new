package com.example.rclack.spring2.day0418.bootstrap;

import com.example.rclack.spring2.day0418.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "caolonglong")
    public String helloWorld() {
        return "Hello,World ";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(ConditionalSystemPropertyBootstrap.class)
                        .web(WebApplicationType.NONE).run(args);

        String string = context.getBean("helloWorld",String.class);

        System.out.println("ConditionalOnSystemProperty is Bean :" + string);

        context.close();
    }

}
