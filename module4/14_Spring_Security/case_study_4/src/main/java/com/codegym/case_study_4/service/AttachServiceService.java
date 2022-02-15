package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.AttachService;
import org.springframework.stereotype.Service;

@Service
public interface AttachServiceService {
    Iterable<AttachService> findAll();
}
