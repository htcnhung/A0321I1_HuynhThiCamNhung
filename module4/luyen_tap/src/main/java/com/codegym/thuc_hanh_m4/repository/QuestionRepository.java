package com.codegym.thuc_hanh_m4.repository;

import com.codegym.thuc_hanh_m4.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByTitleContaining(String title);
}
