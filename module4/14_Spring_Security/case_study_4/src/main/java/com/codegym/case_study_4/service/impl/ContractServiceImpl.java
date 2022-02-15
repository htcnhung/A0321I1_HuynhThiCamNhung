package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.Contract;
import com.codegym.case_study_4.model.ContractDetail;
import com.codegym.case_study_4.repository.ContractRepository;
import com.codegym.case_study_4.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override
    public Iterable<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Contract findById(Long id) {
        return contractRepository.getOne(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {
        contractRepository.deleteById(id);

    }
}
