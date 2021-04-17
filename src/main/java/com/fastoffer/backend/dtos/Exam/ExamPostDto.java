package com.fastoffer.backend.dtos.Exam;

import lombok.Data;

import java.util.UUID;

@Data
public class ExamPostDto {
    private UUID questionId;
//    private String selectedOption;
}
