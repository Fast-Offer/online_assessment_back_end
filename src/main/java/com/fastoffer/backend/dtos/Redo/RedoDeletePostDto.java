package com.fastoffer.backend.dtos.Redo;

import lombok.Data;

import java.util.UUID;

@Data
public class RedoDeletePostDto {
    private UUID questionId;
    private UUID intervieweeID;

}
