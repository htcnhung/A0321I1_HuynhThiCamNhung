package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType, String> {
}
