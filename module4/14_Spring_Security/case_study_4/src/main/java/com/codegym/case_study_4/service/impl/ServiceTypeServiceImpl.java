package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.ServiceType;
import com.codegym.case_study_4.repository.ServiceTypeRepository;
import com.codegym.case_study_4.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @Override
    public Iterable<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
