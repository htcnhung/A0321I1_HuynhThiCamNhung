package com.codegym.bai_tap.service;

import com.codegym.bai_tap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserById(Integer id);
}
