package com.codegym.thuc_hanh_m4.repository;

import com.codegym.thuc_hanh_m4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
