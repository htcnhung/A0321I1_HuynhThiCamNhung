package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.EducationDegree;
import com.codegym.case_study_4.repository.EducationDegreeRepository;
import com.codegym.case_study_4.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public Iterable<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
