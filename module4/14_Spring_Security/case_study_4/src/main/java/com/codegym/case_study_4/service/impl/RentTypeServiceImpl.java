package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.RentType;
import com.codegym.case_study_4.repository.RentTypeRepository;
import com.codegym.case_study_4.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;

    @Override
    public Iterable<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
