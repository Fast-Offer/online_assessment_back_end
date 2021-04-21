package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Practice.PracticeGetDto;
import com.fastoffer.backend.dtos.Practice.PracticePostDto;
import com.fastoffer.backend.services.PracticeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/practices")
@AllArgsConstructor
public class PracticeController {
    private final PracticeService practiceService;

    @PostMapping
    public ResponseEntity<PracticeGetDto> findCorrectOption(@RequestBody PracticePostDto practicePostDto) {
        return ResponseEntity.ok(practiceService.findCorrectOption(practicePostDto));
    }
}
