package com.codewithaz.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private List<PostDto> content;
    private int currentPageNumber;
    private int pageSize;
    private int totalNumberOfPages;
    private long totalNumberOfElements;
    private boolean isLast;
}
