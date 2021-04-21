package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Bug.BugGetDto;
import com.fastoffer.backend.dtos.Bug.BugPostDto;
import com.fastoffer.backend.services.BugServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bugs")
@RestController
@RequiredArgsConstructor
public class BugController {

    private final BugServices bugServices;

    @PostMapping
    public ResponseEntity<BugGetDto> createBug(@RequestBody BugPostDto bugPostDto) {
       BugGetDto bugGetDto= bugServices.createBug(bugPostDto);

       return ResponseEntity.ok(bugGetDto);
    }
}
