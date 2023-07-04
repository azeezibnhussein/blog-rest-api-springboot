package com.codewithaz.blog.service;

import com.codewithaz.blog.payload.CommentDto;

public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);
}
