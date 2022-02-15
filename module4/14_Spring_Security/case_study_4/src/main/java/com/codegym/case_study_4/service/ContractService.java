package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.Contract;
import org.springframework.stereotype.Service;

@Service
public interface ContractService {
    Iterable<Contract> findAll();

    Contract findById(Long id);

    void save(Contract contract);

    void remove(Long id);

}
