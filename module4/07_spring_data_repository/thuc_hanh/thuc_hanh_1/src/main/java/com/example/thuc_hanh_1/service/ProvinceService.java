package com.example.thuc_hanh_1.service;

import com.example.thuc_hanh_1.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
