package com.fastoffer.backend.dtos;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BugGetDto {

    private UUID id;

    private UUID questionID;

    private UUID reporter;

    private Timestamp reportTime;
}
