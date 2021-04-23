package com.fastoffer.backend.dtos.Question;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class QuestionGetDto {
    private UUID questionId;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
}
