package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Fav.FavDeleteGetDto;
import com.fastoffer.backend.dtos.Fav.FavDeletePostDto;
import com.fastoffer.backend.services.FavService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deleteFavQuestions")
@RequiredArgsConstructor
public class FavDeleteController {
    private final FavService favService;

    @PostMapping
    public ResponseEntity<FavDeleteGetDto> deleteRedoQuestion(@RequestBody FavDeletePostDto favDeletePostDto){
        FavDeleteGetDto favDeleteGetDto= favService.deleteFavQuestion(favDeletePostDto);
        return ResponseEntity.ok(favDeleteGetDto);
    }
}


