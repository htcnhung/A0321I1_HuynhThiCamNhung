package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
