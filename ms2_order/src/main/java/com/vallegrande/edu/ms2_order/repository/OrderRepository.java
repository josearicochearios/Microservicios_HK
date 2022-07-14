package com.vallegrande.edu.ms2_order.repository;

import com.vallegrande.edu.ms2_order.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
