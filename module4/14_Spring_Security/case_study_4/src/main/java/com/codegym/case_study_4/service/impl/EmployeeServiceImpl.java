package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Employee;
import com.codegym.case_study_4.repository.EmployeeRepository;
import com.codegym.case_study_4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findByUser_id(long id) {
        return employeeRepository.findByUser_useId(id);
    }

    @Override
    public Page<Employee> findByInputText(String inputSearch, Pageable pageable) {
        return employeeRepository.findByEmployeeNameContaining(inputSearch, pageable);
    }
}
