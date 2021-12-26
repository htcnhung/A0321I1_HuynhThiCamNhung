package com.codegym.blogrestful.repository;

import com.codegym.blogrestful.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

    Page<Blog> findByContentContaining(String content, Pageable pageable);
}
