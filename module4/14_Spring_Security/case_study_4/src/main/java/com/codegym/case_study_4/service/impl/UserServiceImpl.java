package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.User;
import com.codegym.case_study_4.repository.UserRepository;
import com.codegym.case_study_4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByUserName(String name) {
        return userRepository.findByUsername(name);
    }
}
