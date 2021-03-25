package com.fastoffer.backend.dtos.redo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedoGetDto {
    private String id;
    private String title;
    private String category;
}
