package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.SignupGetDto;
import com.fastoffer.backend.dtos.SignupPostDto;
import com.fastoffer.backend.services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    SignupService signupService;


    @PostMapping
    public ResponseEntity<SignupGetDto> createInterviewee(@RequestBody SignupPostDto signupPostDto){
        SignupGetDto signupGetDto = signupService.createInterviewee(signupPostDto);
        return ResponseEntity.ok(signupGetDto);
    }
}
