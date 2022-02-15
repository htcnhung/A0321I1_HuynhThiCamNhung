package com.codegym.thuc_hanh_m4.service;

import com.codegym.thuc_hanh_m4.model.QuestionType;

public interface QuestionTypeService {
    Iterable<QuestionType> findAll();
    QuestionType findById(int id);
}
