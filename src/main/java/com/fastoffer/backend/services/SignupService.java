package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Signup.SignupGetDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.mapper.SignupMapper;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    private final SignupMapper signupMapper;

    public SignupGetDto createUser(SignupPostDto signupPostDto) {

        if(intervieweeAccountRepository.existsByEmail(signupPostDto.getEmail())) {
            throw new InvalidAccountException("Email already exists");
        }

        IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.save(signupMapper.toEntity(signupPostDto));
        return signupMapper.fromEntity(intervieweeAccountEntity);
    }
}