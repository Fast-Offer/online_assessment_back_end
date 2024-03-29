package com.fastoffer.backend.dtos.Bug;

import lombok.Data;

import java.util.UUID;

@Data
public class BugPostDto {

    private UUID accountID;

    private UUID questionID;

    private String bugContent;
}
