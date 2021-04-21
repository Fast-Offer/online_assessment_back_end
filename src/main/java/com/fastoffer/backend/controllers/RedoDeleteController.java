package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Redo.RedoDeleteGetDto;
import com.fastoffer.backend.dtos.Redo.RedoDeletePostDto;
import com.fastoffer.backend.services.RedoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/deleteRedoQuestions")
@RequiredArgsConstructor
public class RedoDeleteController {

    private final RedoService redoService;

    @PostMapping
    public ResponseEntity<RedoDeleteGetDto> deleteRedoQuestion(@RequestBody RedoDeletePostDto redoDeletePostDto){
        RedoDeleteGetDto redoDeleteGetDto= redoService.deleteRedoQuestion(redoDeletePostDto);
        return ResponseEntity.ok(redoDeleteGetDto);
    }
}


