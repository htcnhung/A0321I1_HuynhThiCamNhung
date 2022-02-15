package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,String> {
}
