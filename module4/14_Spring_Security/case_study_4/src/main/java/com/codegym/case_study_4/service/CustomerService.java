package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findAll(Pageable pageable);

    Customer findById(String id);

    void save(Customer customer);

    void remove(String id);

    Page<Customer> findByInputText(String inputSearch, Pageable pageable);
}
