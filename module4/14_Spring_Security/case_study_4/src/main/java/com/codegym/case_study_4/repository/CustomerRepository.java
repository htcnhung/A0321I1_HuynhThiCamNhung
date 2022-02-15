package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
        Page<Customer> findByCustomerNameContaining (String name, Pageable pageable);
}
