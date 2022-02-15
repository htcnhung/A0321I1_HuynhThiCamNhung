package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.RentType;
import org.springframework.stereotype.Service;

@Service
public interface RentTypeService {
    Iterable<RentType> findAll();
}
