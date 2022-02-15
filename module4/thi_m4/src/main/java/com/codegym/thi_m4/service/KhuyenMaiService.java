package com.codegym.thi_m4.service;

import com.codegym.thi_m4.model.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhuyenMaiService {
    Iterable<KhuyenMai> findAll();
    Page<KhuyenMai> findAll(Pageable pageable);

    KhuyenMai findById(int id);

    void save(KhuyenMai khuyenMai);

    void remove(int id);

    List<KhuyenMai> findByTitle(String title);
}
