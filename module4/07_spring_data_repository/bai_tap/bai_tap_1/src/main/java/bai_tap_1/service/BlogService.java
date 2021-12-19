package bai_tap_1.service;

import bai_tap_1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findOne(Long id);

    void save(Blog blog);

    void delete(Long id);

    Page<Blog> findByContentContaining(String content, Pageable pageable);
}
