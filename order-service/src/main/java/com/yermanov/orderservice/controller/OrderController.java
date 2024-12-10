package com.yermanov.orderservice.controller;

import com.yermanov.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable Long id){
        return "Order with id " + id;
    }

    @GetMapping("/{orderId}/user/{userId}")
    public String getOrderAndUser(@PathVariable String orderId, @PathVariable String userId) {
        return orderService.getOrderAndUser(orderId, userId);
    }
}
