package com.codegym.case_study_4.repository;

import com.codegym.case_study_4.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, String> {
    Employee findByUser_useId(Long id);
    Page<Employee> findByEmployeeNameContaining(String name, Pageable pageable);
}
