package com.fastoffer.backend.dtos.Fav;

import lombok.Data;

import java.util.UUID;

@Data
public class FavDeletePostDto {
    private UUID questionID;
    private UUID intervieweeID;

}
