package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Fav.FavGetDto;
import com.fastoffer.backend.dtos.Fav.FavPostDto;
import com.fastoffer.backend.services.FavService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/favs")
public class favController {
    private final FavService favService;

    @PostMapping
    public ResponseEntity<FavGetDto> createFav(@RequestBody FavPostDto favPostDto) {
        FavGetDto favGetDto = favService.createFav(favPostDto);
        return ResponseEntity.ok(favGetDto);
    }
}
