package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.IntervieweeGetDto;
import com.fastoffer.backend.dtos.IntervieweePostDto;
import com.fastoffer.backend.services.IntervieweeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class IntervieweeController {

    @Autowired
    IntervieweeService intervieweeService;

    @PostMapping
    public ResponseEntity<IntervieweeGetDto> createProfile(@RequestBody IntervieweePostDto intervieweePostDto) {
        IntervieweeGetDto intervieweeGetDto = intervieweeService.createIntervieweeProfile(intervieweePostDto);

        return ResponseEntity.ok(intervieweeGetDto);
    }

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("conn");
    }

}
