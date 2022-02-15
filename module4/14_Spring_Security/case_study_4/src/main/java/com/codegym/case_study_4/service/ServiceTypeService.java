package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.ServiceType;
import org.springframework.stereotype.Service;

@Service
public interface ServiceTypeService {
    Iterable<ServiceType> findAll();
}
