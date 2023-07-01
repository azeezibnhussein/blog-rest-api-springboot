package com.codewithaz.blog.repository;

import com.codewithaz.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
