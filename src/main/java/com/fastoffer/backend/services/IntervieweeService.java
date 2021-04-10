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

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class IntervieweeService {

    private final IntervieweeProfileRepository intervieweeProfileRepository;

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    private final IntervieweeProfileMapper intervieweeProfileMapper;

    @Transactional
    public IntervieweeProfileGetDto createIntervieweeProfile(IntervieweeProfilePostDto intervieweeProfilePostDto) {
        IntervieweeProfileEntity intervieweeProfileEntity = intervieweeProfileMapper.toEntity(intervieweeProfilePostDto);

        IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.findById(intervieweeProfilePostDto.getAccountId()).get();

        if(intervieweeAccountEntity != null) {

            intervieweeProfileEntity.setIntervieweeAccountEntity(intervieweeAccountEntity);
            IntervieweeProfileEntity savedIntervieweeProfileEntity = intervieweeProfileRepository.save(intervieweeProfileEntity);

            //Set the profileId in IntervieweeAccoount table
            intervieweeAccountRepository.modifyIntervieweeProfileId(savedIntervieweeProfileEntity.getProfileId(), intervieweeProfilePostDto.getAccountId());

            return intervieweeProfileMapper.fromEntity(savedIntervieweeProfileEntity);
        }

        throw new InvalidAccountException("User does not exists, please sign up first");
    }

}
