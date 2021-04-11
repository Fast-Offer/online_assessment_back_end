package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Login.LoginGetDto;
import com.fastoffer.backend.dtos.Login.LoginPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    public LoginGetDto verifyLogin(LoginPostDto loginPostDto) {

        LoginGetDto loginGetDto = new LoginGetDto();

        IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.findByEmail(loginPostDto.getEmail());

        if(intervieweeAccountRepository.existsByEmail(loginPostDto.getEmail()) &&
                intervieweeAccountEntity.getPassword().equals(loginPostDto.getPassword())){

            loginGetDto.setAccountId(intervieweeAccountEntity.getAccountId());
            loginGetDto.setEmail(intervieweeAccountEntity.getEmail());
            return loginGetDto;
        }

        throw new InvalidAccountException("email and password does not match");
    }
}


