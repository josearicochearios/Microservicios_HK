package com.vallegrande.edu.ms3_product.repository;

import com.vallegrande.edu.ms3_product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
