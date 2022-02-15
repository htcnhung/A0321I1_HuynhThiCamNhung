package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Position;
import org.springframework.stereotype.Service;

@Service
public interface PositionService {
    Iterable<Position> findAll();
}
