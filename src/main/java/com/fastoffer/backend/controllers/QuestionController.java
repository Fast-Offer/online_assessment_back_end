package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<QuestionGetDto> getQuestion(@RequestBody QuestionPostDto questionPostDto){
        return ResponseEntity.ok(questionService.getQuestion(questionPostDto));
    }

    @GetMapping(path = "{collectionId}")
    public List<QuestionGetDto> getQuestionsByCollectionId(@PathVariable("collectionId") UUID collectionId) {
        System.out.println("Controller: " + collectionId);
        return questionService.getQuestionsByCollectionId(collectionId);
    }
}
