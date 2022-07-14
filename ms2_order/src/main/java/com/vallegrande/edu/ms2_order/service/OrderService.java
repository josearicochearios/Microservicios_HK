package com.vallegrande.edu.ms2_order.service;

import com.vallegrande.edu.ms2_order.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order create(Order order);

    Order update(Order order);

    void delete(String id);

}
