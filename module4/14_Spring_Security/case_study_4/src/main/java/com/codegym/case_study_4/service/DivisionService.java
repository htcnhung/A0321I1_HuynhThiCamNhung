package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Division;
import org.springframework.stereotype.Service;

@Service
public interface DivisionService {
    Iterable<Division> findAll();
}
