package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Signup.SignupGetDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.services.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup")
@RequiredArgsConstructor
public class SignupController {

    private final SignupService signupService;

    @PostMapping
    public ResponseEntity<SignupGetDto> createUser(@RequestBody SignupPostDto signupPostDto){
        return ResponseEntity.ok(signupService.createUser(signupPostDto));
    }
}
