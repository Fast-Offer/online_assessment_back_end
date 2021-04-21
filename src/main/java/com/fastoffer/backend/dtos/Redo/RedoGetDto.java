package com.fastoffer.backend.dtos.Redo;

import lombok.Data;

import java.util.UUID;
@Data
public class RedoGetDto {
    private UUID questionId;
    private String title;
    private String category;
}
