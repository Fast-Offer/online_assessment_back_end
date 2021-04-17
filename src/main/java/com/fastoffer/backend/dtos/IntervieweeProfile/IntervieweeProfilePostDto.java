package com.fastoffer.backend.dtos.IntervieweeProfile;

import lombok.Data;

import java.util.UUID;

@Data
public class IntervieweeProfilePostDto {

    private UUID accountId;
//    private String email;

    private String name;

    private String age;

    private String avatar;

    private String selfIntroduction;

    private String phone;

    private String website;

    private String location;
}
