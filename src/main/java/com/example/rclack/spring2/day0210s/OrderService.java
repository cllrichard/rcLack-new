package com.example.rclack.spring2.day0210s;

import java.util.List;

public interface OrderService {

    void createOrder();

    void deleteOrderById(String id);

    String getOrderById(String id);

    List<String> findAll();
}
