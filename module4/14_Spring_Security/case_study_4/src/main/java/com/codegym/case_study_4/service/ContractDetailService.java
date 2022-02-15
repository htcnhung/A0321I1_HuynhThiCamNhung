package com.codegym.case_study_4.service;

import com.codegym.case_study_4.model.ContractDetail;
import org.springframework.stereotype.Service;

@Service
public interface ContractDetailService {
    Iterable<ContractDetail> findAll();

    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);

}
