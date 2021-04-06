package com.fastoffer.backend.dtos;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class FavGetDto {

    private UUID id;

    private UUID question_id;

    private UUID interviewee_account_id;

    private Timestamp timestamp;
}
