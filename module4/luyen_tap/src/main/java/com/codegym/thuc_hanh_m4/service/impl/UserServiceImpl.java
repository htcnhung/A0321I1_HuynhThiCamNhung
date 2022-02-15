package com.codegym.thuc_hanh_m4.service.impl;

import com.codegym.thuc_hanh_m4.model.User;
import com.codegym.thuc_hanh_m4.repository.UserRepository;
import com.codegym.thuc_hanh_m4.service.UserService;
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
    public User findById(int id) {
        return userRepository.getOne(id);
    }
}
