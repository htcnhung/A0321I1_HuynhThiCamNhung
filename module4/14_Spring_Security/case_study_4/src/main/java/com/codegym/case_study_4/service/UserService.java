package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Iterable<User> findAll();
    void save(User user);
    User findByUserName(String name);
}
