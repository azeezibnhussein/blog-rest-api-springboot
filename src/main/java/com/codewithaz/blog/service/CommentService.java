package com.codewithaz.blog.service;

import com.codewithaz.blog.payload.CommentDto;

import java.util.List;

public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);

    public List<CommentDto> getAllComments(long postId);

    public CommentDto getCommentById(long postId, long commentId);
}
