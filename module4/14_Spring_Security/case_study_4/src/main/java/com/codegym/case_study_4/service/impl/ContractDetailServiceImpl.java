package com.codegym.case_study_4.service.impl;

import com.codegym.case_study_4.model.ContractDetail;
import com.codegym.case_study_4.repository.ContractDetailRepository;
import com.codegym.case_study_4.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public Iterable<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(Long id) {
        return contractDetailRepository.getOne(id);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);

    }

    @Override
    public void remove(Long id) {
        contractDetailRepository.deleteById(id);
    }
}
