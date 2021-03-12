package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.LoginGetDto;
import com.fastoffer.backend.dtos.LoginPostDto;
import com.fastoffer.backend.entities.IntervieweeEntity;
import com.fastoffer.backend.repositories.IntervieweeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LoginService {
    @Autowired
    IntervieweeRepository intervieweeRepository;

    public EgoResults verifyLogin(LoginPostDto loginPostDto) {
        LoginGetDto loginGetDto = new LoginGetDto();

        IntervieweeEntity intervieweeEntity = findByEmail(loginPostDto.getEmail());

        EgoResults egoResults;

        if(intervieweeRepository.existsByEmail(loginPostDto.getEmail())){
            if (intervieweeEntity.getPassword().equals( loginPostDto.getPassword())) {
                loginGetDto.setResult("match password");
                egoResults = EgoResults.ok(loginGetDto);

            } else {
                loginGetDto.setResult("wrong password");
                egoResults = EgoResults.error(loginGetDto.getResult());
            }
        } else {
            loginGetDto.setResult("not exist this Email");
            egoResults = EgoResults.error(loginGetDto.getResult());
        }
        //判断email

        return egoResults;
    }

    //不存在email

    @GetMapping(value="/findByEmail/{email}")
    public IntervieweeEntity findByEmail(@PathVariable("email") String email){
        return intervieweeRepository.findByEmail(email);
    }
}


