package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Login.LoginGetDto;
import com.fastoffer.backend.dtos.Login.LoginPostDto;
import com.fastoffer.backend.services.LoginService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginGetDto> createUser(@RequestBody LoginPostDto loginPostDto){
        return ResponseEntity.ok(loginService.verifyLogin(loginPostDto));
    }
}
