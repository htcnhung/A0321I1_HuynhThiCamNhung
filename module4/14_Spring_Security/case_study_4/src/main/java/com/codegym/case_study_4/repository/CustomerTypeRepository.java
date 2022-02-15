package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, String> {
}
