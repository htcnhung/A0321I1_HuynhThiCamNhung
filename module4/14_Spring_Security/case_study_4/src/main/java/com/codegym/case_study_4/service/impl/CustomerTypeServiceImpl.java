package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.CustomerType;
import com.codegym.case_study_4.repository.CustomerTypeRepository;
import com.codegym.case_study_4.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
