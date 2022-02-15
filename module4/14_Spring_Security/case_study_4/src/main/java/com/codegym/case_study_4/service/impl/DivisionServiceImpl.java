package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Division;
import com.codegym.case_study_4.repository.DivisionRepository;
import com.codegym.case_study_4.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public Iterable<Division> findAll() {
        return divisionRepository.findAll();
    }
}
