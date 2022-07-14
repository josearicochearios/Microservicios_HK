package com.vallegrande.edu.ms2_order.controller;

import com.vallegrande.edu.ms2_order.model.Order;
import com.vallegrande.edu.ms2_order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms2_order/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order){
        return orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        orderService.delete(id);
    }

}
