package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.EducationDegree;
import org.springframework.stereotype.Service;

@Service
public interface EducationDegreeService {
    Iterable<EducationDegree> findAll();
}
