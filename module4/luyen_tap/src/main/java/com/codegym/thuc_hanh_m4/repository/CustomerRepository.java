//package com.codegym.thuc_hanh_m4.repository;
//import com.codegym.thuc_hanh_m4.model.Customer;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface CustomerRepository extends JpaRepository<Customer, String> {
//    Page<Customer> findByNameCusContaining(String name, Pageable pageable);
//}