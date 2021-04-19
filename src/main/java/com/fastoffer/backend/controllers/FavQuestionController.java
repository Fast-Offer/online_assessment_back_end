package com.fastoffer.backend.controllers;


import com.fastoffer.backend.dtos.Fav.FavQuestionGetDto;
import com.fastoffer.backend.dtos.Fav.FavQuestionPostDto;
import com.fastoffer.backend.services.FavQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/favquestions")
public class FavQuestionController {
    private final FavQuestionService favQuestionService;

    @PostMapping
    public ResponseEntity<List<FavQuestionGetDto>> getFavQuestionList(@RequestBody FavQuestionPostDto favQuestionPostDto) {
        List<FavQuestionGetDto> favQuestionGetDtoList = favQuestionService.getFavQuestionList(favQuestionPostDto);
        return ResponseEntity.ok(favQuestionGetDtoList);
    }
}
