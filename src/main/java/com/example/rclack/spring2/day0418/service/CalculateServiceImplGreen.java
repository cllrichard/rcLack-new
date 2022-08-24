package com.example.rclack.spring2.day0418.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("Green")
@Service
public class CalculateServiceImplGreen implements CalculateService {


    @Override
    public Integer sum(Integer... values) {
        System.out.println("Green::::::");
        return Stream.of(values).reduce(0, Integer::sum);
    }
}
