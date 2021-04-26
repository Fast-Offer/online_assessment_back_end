package com.fastoffer.backend.dtos.Mock;

import lombok.Data;

import java.util.UUID;

@Data
public class MockPostDto {
    private UUID questionId;
    private String userAnswer;
}
