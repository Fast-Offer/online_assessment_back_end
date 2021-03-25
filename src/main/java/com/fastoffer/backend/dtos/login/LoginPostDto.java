package com.fastoffer.backend.dtos.login;

import lombok.Data;

@Data
public class LoginPostDto {
    private String email;
    private String password;
}
