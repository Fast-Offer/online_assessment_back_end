package com.fastoffer.backend.dtos.Login;

import lombok.Data;

import java.util.UUID;

@Data
public class LoginGetDto {
    private UUID accountId;
    private String email;
//    private String result;
}
