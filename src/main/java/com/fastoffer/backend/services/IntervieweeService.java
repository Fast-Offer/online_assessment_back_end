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

        if(intervieweeAccountRepository.existsByIntervieweeId(intervieweeProfilePostDto.getAccountId())) {
            IntervieweeProfileEntity intervieweeProfileEntity = intervieweeProfileMapper.toEntity(intervieweeProfilePostDto);

            IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.findById(intervieweeProfilePostDto.getAccountId()).get();
            intervieweeProfileEntity.setIntervieweeAccountEntity(intervieweeAccountEntity);
            IntervieweeProfileEntity savedIntervieweeProfileEntity = intervieweeProfileRepository.save(intervieweeProfileEntity);

            //TODO: Set the profileId in IntervieweeAccoount table
            IntervieweeProfileGetDto intervieweeProfileGetDto = intervieweeProfileMapper.fromEntity(savedIntervieweeProfileEntity);
            intervieweeAccountRepository.modifyIntervieweeProfileId(intervieweeProfileGetDto.getProfileId(), intervieweeProfilePostDto.getAccountId());

            return intervieweeProfileGetDto;
        }

        throw new InvalidAccountException("User does not exists, please sign up first");
    }

}
