package com.fastoffer.backend.dtos.FavQuestion;

import lombok.Data;

import java.util.UUID;

@Data
public class FavQuestionGetDto {
    private UUID questionId;
    private String title;
    private String category;
}
