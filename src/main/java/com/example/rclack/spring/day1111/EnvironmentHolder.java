package com.example.rclack.spring.day1111;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EnvironmentHolder {

    @Autowired
    Environment environment;

    public void printEnvironment() {
//        System.out.println(environment);
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
        System.out.println(environment.getProperty("jdbc.url"));
    }

}
