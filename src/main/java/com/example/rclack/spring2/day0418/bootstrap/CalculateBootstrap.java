package com.example.rclack.spring2.day0418.bootstrap;

import com.example.rclack.spring2.day0418.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(scanBasePackages = "com.example.rclack.spring2.day0418.service")
public class CalculateBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(CalculateBootstrap.class)
                        .profiles("Red")
                        .web(WebApplicationType.NONE).run(args);

        CalculateService CalculateService = context.getBean(CalculateService.class);

        System.out.println("CalculateService is Bean :" + CalculateService.sum(1, 2, 3, 4, 5));

        context.close();
    }

}
