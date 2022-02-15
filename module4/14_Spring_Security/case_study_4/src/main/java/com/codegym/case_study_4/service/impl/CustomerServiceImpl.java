package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Customer;
import com.codegym.case_study_4.repository.CustomerRepository;
import com.codegym.case_study_4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
customerRepository.save(customer);
    }

    @Override
    public void remove(String id) {
       Customer customer = customerRepository.getOne(id);
       customerRepository.delete(customer);

    }

    @Override
    public Page<Customer> findByInputText(String inputSearch, Pageable pageable) {
        return customerRepository.findByCustomerNameContaining(inputSearch, pageable);
    }
}
