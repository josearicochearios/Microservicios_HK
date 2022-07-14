package com.vallegrande.edu.ms2_order.service;

import com.vallegrande.edu.ms2_order.model.Order;
import com.vallegrande.edu.ms2_order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        Optional<Order> optionalOrder = orderRepository.findById(order.getId());
        if(!optionalOrder.isPresent()) throw new RuntimeException("No se encontro el pedido");
        return orderRepository.save(order);
    }

    @Override
    public void delete(String id) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if(!optionalOrder.isPresent()) throw new RuntimeException("No se encontro el pedido");
        orderRepository.deleteById(id);
    }
}
