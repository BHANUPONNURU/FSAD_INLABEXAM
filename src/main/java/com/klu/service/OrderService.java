package com.klu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Order;
import com.klu.repository.OrderRepository;

@Service
public class OrderService
{
    @Autowired
    private OrderRepository repo;

    public Order addOrder(Order order)
    {
        return repo.save(order);
    }

    public List<Order> viewOrders()
    {
        return repo.findAll();
    }
}