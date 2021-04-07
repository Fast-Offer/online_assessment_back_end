package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Signup.SignupGetDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.FIELD)
public interface SignupMapper {
    IntervieweeAccountEntity toEntity(SignupPostDto signupPostDto);

    SignupGetDto fromEntity(IntervieweeAccountEntity intervieweeAccountEntity);
}
