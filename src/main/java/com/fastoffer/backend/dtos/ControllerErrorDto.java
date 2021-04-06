package com.fastoffer.backend.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class FastofferErrorDto {

    private final int errorCode;

    private final String message;
}
