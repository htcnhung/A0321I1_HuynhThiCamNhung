package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, String> {
}
