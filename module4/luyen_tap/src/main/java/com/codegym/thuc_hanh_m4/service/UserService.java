package com.codegym.thuc_hanh_m4.service;

import com.codegym.thuc_hanh_m4.model.User;

public interface UserService {
    Iterable<User> findAll();
    User findById(int id);
}
