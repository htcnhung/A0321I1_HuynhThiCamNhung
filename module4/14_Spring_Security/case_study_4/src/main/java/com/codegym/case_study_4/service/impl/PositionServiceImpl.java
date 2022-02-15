package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Position;
import com.codegym.case_study_4.repository.PositionRepository;
import com.codegym.case_study_4.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public Iterable<Position> findAll() {
        return positionRepository.findAll();
    }
}
