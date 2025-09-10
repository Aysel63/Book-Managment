package com.minilibrary.dto;

import lombok.Data;

@Data
public class BookRequestDto {
    private String title;
    private String isbn;
    private String authorId;
}
