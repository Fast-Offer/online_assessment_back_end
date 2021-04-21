package com.fastoffer.backend.dtos.Fav;

import lombok.Data;

import java.util.UUID;

@Data
public class FavPostDto {
    private UUID accountID;
    private UUID questionID;
}
