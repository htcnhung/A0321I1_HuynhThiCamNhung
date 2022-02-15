package com.codegym.thuc_hanh_m4.service.impl;

import com.codegym.thuc_hanh_m4.model.QuestionType;
import com.codegym.thuc_hanh_m4.repository.QuestionTypeRepository;
import com.codegym.thuc_hanh_m4.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    QuestionTypeRepository questionTypeRepository;

    @Override
    public Iterable<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public QuestionType findById(int id) {
        return questionTypeRepository.getOne(id);
    }
}
