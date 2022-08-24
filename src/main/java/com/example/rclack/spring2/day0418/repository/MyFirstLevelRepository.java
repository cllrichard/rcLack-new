package com.example.rclack.spring2.day0418.repository;

import com.example.rclack.spring2.day0418.annotation.FirstLevelRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@FirstLevelRepository(value = "myFirstLevelRepository")
@Component(value = "myFirstLevelRepository") //Bean name = myFirstLevelRepository
@Configuration
public class MyFirstLevelRepository {

}
