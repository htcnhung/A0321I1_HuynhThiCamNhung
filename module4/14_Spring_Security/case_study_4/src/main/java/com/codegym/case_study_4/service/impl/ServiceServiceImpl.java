package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Service;
import com.codegym.case_study_4.repository.ServiceRepository;
import com.codegym.case_study_4.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Iterable<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Service findById(String id) {
        return serviceRepository.getOne(id);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(String id) {
        serviceRepository.deleteById(id);
    }
}
