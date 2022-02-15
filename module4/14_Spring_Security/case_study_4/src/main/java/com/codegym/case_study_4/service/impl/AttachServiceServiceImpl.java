package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.AttachService;
import com.codegym.case_study_4.repository.AttachServiceRepository;
import com.codegym.case_study_4.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    AttachServiceRepository attachServiceRepository;
    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
