package com.fastoffer.backend.dtos.Redo;

import lombok.Data;

import java.util.UUID;
@Data
public class RedoGetDto {
    private UUID id;
    private String title;
    private String category;
}
