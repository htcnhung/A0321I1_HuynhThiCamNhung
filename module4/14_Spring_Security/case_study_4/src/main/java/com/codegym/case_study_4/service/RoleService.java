package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Iterable<Role> findAll();

    Role findById(Long id);
}
