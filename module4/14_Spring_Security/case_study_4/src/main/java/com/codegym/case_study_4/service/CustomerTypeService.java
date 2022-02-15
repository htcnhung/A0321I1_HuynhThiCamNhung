package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.CustomerType;
import org.springframework.stereotype.Service;

@Service
public interface CustomerTypeService {
    Iterable<CustomerType> findAll();
}
