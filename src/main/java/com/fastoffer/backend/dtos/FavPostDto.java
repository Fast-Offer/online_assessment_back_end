package com.fastoffer.backend.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class FavPostDto {
    private UUID intervieweeID;
    private UUID questionID;
}
