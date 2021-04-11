package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Signup.SignupGetDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {
    private final IntervieweeAccountRepository intervieweeAccountRepository;

    public SignupGetDto createUser(SignupPostDto signupPostDto) {
        IntervieweeAccountEntity intervieweeAccountEntity = this.mapPostDtoToEntity(signupPostDto);

        if(intervieweeAccountRepository.existsByEmail(signupPostDto.getEmail())) {
            throw new InvalidAccountException("Email already exists");
        }

        IntervieweeAccountEntity savedIntervieweeEntity = intervieweeAccountRepository.save(intervieweeAccountEntity);
        SignupGetDto signupGetDto = this.mapEntityToGetDto(savedIntervieweeEntity);
        return signupGetDto;
    }

    /*
        TODO: Needs to be refactored.
        1. Class
        2. Map function
     */

    private IntervieweeAccountEntity mapPostDtoToEntity(SignupPostDto signupPostDto){
        IntervieweeAccountEntity intervieweeAccountEntity = new IntervieweeAccountEntity();
        intervieweeAccountEntity.setEmail(signupPostDto.getEmail());
        intervieweeAccountEntity.setPassword(signupPostDto.getPassword());
        return intervieweeAccountEntity;
    }

    private SignupGetDto mapEntityToGetDto(IntervieweeAccountEntity intervieweeAccountEntity){
        SignupGetDto signupGetDto = new SignupGetDto();
        signupGetDto.setInterviewee_id(intervieweeAccountEntity.getInterviewee_id().toString());
        signupGetDto.setEmail(intervieweeAccountEntity.getEmail());
        return signupGetDto;
    }
}