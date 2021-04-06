package com.fastoffer.backend.dtos.IntervieweeProfile;

import lombok.Data;

@Data
public class IntervieweePostDto {
    private String name;
    private String age;
    private String avatar;
    private String self_introduction;
    private String phone;
    private String website;
    private String location;
}
