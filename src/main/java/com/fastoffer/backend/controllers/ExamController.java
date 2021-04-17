package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Exam.ExamGetDto;
import com.fastoffer.backend.dtos.Exam.ExamPostDto;
import com.fastoffer.backend.services.ExamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/practices")
@AllArgsConstructor
public class ExamController {
    private final ExamService examService;

    @PostMapping
    public ResponseEntity<ExamGetDto> findCorrectOption(@RequestBody ExamPostDto examPostDto) {
        return ResponseEntity.ok(examService.findCorrectOption(examPostDto));
    }
}
