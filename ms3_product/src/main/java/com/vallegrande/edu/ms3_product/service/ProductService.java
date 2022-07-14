package com.vallegrande.edu.ms3_product.service;

import com.vallegrande.edu.ms3_product.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product create(Product product);

    Product update(Product product);

    void delete(String id);

}
