package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Role;
import com.codegym.case_study_4.repository.RoleRepository;
import com.codegym.case_study_4.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.getOne(id);
    }
}
