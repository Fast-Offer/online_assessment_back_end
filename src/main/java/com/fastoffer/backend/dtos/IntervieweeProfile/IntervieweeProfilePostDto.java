package com.fastoffer.backend.dtos.IntervieweeProfile;

import lombok.Data;

@Data
public class IntervieweeProfilePostDto {
    private String interviewee_id; // interviewee_id should be inserted by frontend
    private String name;
    private String age;
    private String avatar;
    private String self_introduction;
    private String phone;
    private String website;
    private String location;
}
