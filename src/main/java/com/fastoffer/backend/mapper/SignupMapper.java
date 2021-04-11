package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Signup.SignupGetDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SignupMapper {
    IntervieweeAccountEntity toEntity(SignupPostDto signupPostDto);

    SignupGetDto fromEntity(IntervieweeAccountEntity intervieweeAccountEntity);
}
