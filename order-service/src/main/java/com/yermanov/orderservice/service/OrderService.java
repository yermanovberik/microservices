package com.yermanov.orderservice.service;

import com.yermanov.orderservice.client.UserClient;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final UserClient userClient;

    public OrderService(UserClient userClient) {
        this.userClient = userClient;
    }

    public String getOrderAndUser(String orderId, String userId) {
        String user = userClient.getUser(userId);
        return "Order " + orderId + " for " + user;
    }
}
