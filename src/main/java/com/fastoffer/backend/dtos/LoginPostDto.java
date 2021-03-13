package com.fastoffer.backend.dtos;

import lombok.Data;

@Data
public class LoginPostDto {
    private String email;
    private String password;
}
