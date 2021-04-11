package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfileGetDto;
import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfilePostDto;
import com.fastoffer.backend.entities.IntervieweeProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "Spring")
public interface IntervieweeProfileMapper {
    IntervieweeProfileEntity toEntity(IntervieweeProfilePostDto intervieweeProfilePostDto);

    IntervieweeProfileGetDto fromEntity(IntervieweeProfileEntity intervieweeProfileEntity);
}
