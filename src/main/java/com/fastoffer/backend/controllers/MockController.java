package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Login.LoginGetDto;
import com.fastoffer.backend.dtos.Login.LoginPostDto;
import com.fastoffer.backend.dtos.Mock.MockGetDto;
import com.fastoffer.backend.dtos.Mock.MockPostDto;
import com.fastoffer.backend.services.LoginService;
import com.fastoffer.backend.services.MockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/Mocks")
public class MockController {
    private final MockService mockService;

    @PostMapping
    public ResponseEntity<MockGetDto> getMockAnswer (@RequestBody List<MockPostDto> mockPostDtoList) {
        return ResponseEntity.ok(mockService.getMockAnswer(mockPostDtoList));
    }
}


//public class LoginController {
//    private final LoginService loginService;
//
//    @PostMapping
//    public ResponseEntity<LoginGetDto> createUser(@RequestBody LoginPostDto loginPostDto){
//        return ResponseEntity.ok(loginService.verifyLogin(loginPostDto));
//    }
//}