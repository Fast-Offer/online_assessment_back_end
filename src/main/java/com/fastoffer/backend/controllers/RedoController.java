package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.services.RedoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
@RequestMapping("/redo")
@RequiredArgsConstructor
public class RedoController {

    private final RedoService redoService;

    @PostMapping
    public ResponseEntity<List<RedoGetDto>> returnRedoQuestion(@RequestBody RedoPostDto redoPostDto){
        List<RedoGetDto> redoGetDtoList= redoService.returnRedoList(redoPostDto);
        return ResponseEntity.ok(redoGetDtoList);
    }
}
