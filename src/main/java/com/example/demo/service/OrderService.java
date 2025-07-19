// OrderService.java
package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.User;

import java.util.List;

public interface OrderService {
    Order placeOrder(Order order);
    List<Order> getOrdersByUser(User user);
}
