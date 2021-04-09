package com.fastoffer.backend.dtos.Signup;

import lombok.Data;

import java.util.UUID;

@Data
public class SignupGetDto {

    private UUID intervieweeId;

    private String email;
}
