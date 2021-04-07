//package com.fastoffer.backend.controllers;
//
//import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfileGetDto;
//import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfilePostDto;
//
//import com.fastoffer.backend.services.IntervieweeService;
//import lombok.RequiredArgsConstructor;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/profile")
//@RequiredArgsConstructor
//public class IntervieweeProfileController {
//
//    private final IntervieweeService intervieweeService;
//
//    @PostMapping
//    public ResponseEntity<IntervieweeProfileGetDto> createProfile(@RequestBody IntervieweeProfilePostDto intervieweeProfilePostDto) {
//        IntervieweeProfileGetDto intervieweeProfileGetDto = intervieweeService.editIntervieweeProfile(intervieweeProfilePostDto);
//
//        return ResponseEntity.ok(intervieweeProfileGetDto);
//    }
//}
