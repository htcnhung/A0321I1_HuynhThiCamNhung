//package com.codegym.thi_m4.service.impl;
//import com.codegym.thuc_hanh_m4.model.Question;
//import com.codegym.thuc_hanh_m4.repository.QuestionRepository;
//import com.codegym.thuc_hanh_m4.service.QuestionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
//@Service
//public class QuestionServiceImpl implements QuestionService {
//    @Autowired
//    QuestionRepository questionRepository;
//
//    @Override
//    public Iterable<Question> findAll() {
//        return questionRepository.findAll();
//    }
//
//    @Override
//    public Page<Question> findAll(Pageable pageable) {
//        return questionRepository.findAll(pageable);
//    }
//
//    @Override
//    public Question findById(int id) {
//        return questionRepository.getOne(id);
//    }
//
//    @Override
//    public void save(Question question) {
//        questionRepository.save(question);
//    }
//
//    @Override
//    public void remove(int id) {
//        questionRepository.deleteById(id);
//    }
//
//    @Override
//    public List<Question> findByTitle(String title) {
//        return questionRepository.findByTitleContaining(title);
//    }
//
//
//
////    @Override
////    public Page<Question> findByInputText(String inputSearch, Pageable pageable) { ;
////    }
//}
