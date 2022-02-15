package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Service;

@org.springframework.stereotype.Service
public interface ServiceService {
    Iterable<Service> findAll();

    Service findById(String id);

    void save(Service service);

    void remove(String id);
}
