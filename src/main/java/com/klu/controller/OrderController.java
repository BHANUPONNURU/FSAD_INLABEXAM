package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Order;
import com.klu.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController
{
    @Autowired
    private OrderService service;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order)
    {
        return service.addOrder(order);
    }

    @GetMapping("/view")
    public List<Order> viewOrders()
    {
        return service.viewOrders();
    }
}