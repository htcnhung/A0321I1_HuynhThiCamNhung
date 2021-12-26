package com.codegym.create_cart.service;

import com.codegym.create_cart.model.Product;

public interface ProductService {

    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product customer);

    void remove(Long id);
}
