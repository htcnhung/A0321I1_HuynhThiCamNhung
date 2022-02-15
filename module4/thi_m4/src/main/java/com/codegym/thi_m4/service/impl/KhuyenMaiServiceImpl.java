package com.codegym.thi_m4.service.impl;

import com.codegym.thi_m4.model.KhuyenMai;
import com.codegym.thi_m4.repository.KhuyenMaiRepository;
import com.codegym.thi_m4.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public Iterable<KhuyenMai> findAll() {
        return khuyenMaiRepository.findAll();
    }

    @Override
    public Page<KhuyenMai> findAll(Pageable pageable) {
        return khuyenMaiRepository.findAll(pageable);
    }


    @Override
    public KhuyenMai findById(int id) {
        return khuyenMaiRepository.getOne(id);
    }

    @Override
    public void save(KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);

    }

    @Override
    public void remove(int id) {
        khuyenMaiRepository.deleteById(id);

    }

    @Override
    public List<KhuyenMai> findByTitle(String title) {
        return khuyenMaiRepository.findByTitleContaining(title);
    }
}
