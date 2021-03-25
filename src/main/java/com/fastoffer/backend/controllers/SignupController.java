package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.ResponseResults;
import com.fastoffer.backend.dtos.signup.SignupPostDto;
import com.fastoffer.backend.services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SignupController {
    @Autowired
    private SignupService signupService;
    @PostMapping("/signup")
    public ResponseResults createUser(SignupPostDto signupPostDto){
        return  signupService.createUser(signupPostDto);
    }
}
