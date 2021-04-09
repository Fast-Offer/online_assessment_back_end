package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfileGetDto;
import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfilePostDto;

import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.entities.IntervieweeProfileEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.mapper.IntervieweeProfileMapper;

import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import com.fastoffer.backend.repositories.IntervieweeProfileRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IntervieweeService {

    private final IntervieweeProfileRepository intervieweeProfileRepository;

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    private final IntervieweeProfileMapper intervieweeProfileMapper;

    public IntervieweeProfileGetDto createIntervieweeProfile(IntervieweeProfilePostDto intervieweeProfilePostDto) {

        if(intervieweeAccountRepository.existsByIntervieweeId(intervieweeProfilePostDto.getAccountId())) {
//            IntervieweeProfileEntity intervieweeProfileEntity = new IntervieweeProfileEntity();
            IntervieweeProfileEntity intervieweeProfileEntity = intervieweeProfileMapper.toEntity(intervieweeProfilePostDto);
            intervieweeProfileEntity.setIntervieweeAccountEntity(intervieweeAccountRepository.findById(intervieweeProfilePostDto.getAccountId()).get());
            IntervieweeProfileEntity savedIntervieweeProfileEntity = intervieweeProfileRepository.save(intervieweeProfileMapper.toEntity(intervieweeProfilePostDto));


            return intervieweeProfileMapper.fromEntity(savedIntervieweeProfileEntity);
        }

        throw new InvalidAccountException("User does not exists, please sign up first");
    }

}
