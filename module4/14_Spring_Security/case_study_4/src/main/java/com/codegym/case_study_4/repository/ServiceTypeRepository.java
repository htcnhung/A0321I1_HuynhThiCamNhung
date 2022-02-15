package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepository extends JpaRepository<ServiceType,String> {
}
