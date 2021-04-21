package com.fastoffer.backend.dtos.Fav;

import lombok.Data;

import java.util.UUID;

@Data
public class FavQuestionGetDto {
    private UUID questionId;
    private String title;
    private String category;
}
