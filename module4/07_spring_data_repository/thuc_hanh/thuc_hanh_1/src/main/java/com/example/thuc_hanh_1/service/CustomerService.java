package com.example.thuc_hanh_1.service;

import com.example.thuc_hanh_1.model.Customer;
import com.example.thuc_hanh_1.model.Province;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
