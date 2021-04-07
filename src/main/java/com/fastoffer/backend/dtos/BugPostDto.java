package com.fastoffer.backend.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class BugPostDto {

    private UUID intervieweeID;

    private UUID questionID;

    private String bugContent;
}
