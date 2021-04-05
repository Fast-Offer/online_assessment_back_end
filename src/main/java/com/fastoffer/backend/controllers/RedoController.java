package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.LoginPostDto;
import com.fastoffer.backend.dtos.RedoGetDto;
import com.fastoffer.backend.dtos.RedoPostDto;
import com.fastoffer.backend.services.RedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
@RequestMapping("/redo")

public class RedoController {
    @Autowired
    RedoService redoService;

    @PostMapping
    public ResponseEntity<List<RedoGetDto>> returnRedoQuestion(@RequestBody RedoPostDto redoPostDto){
        List<RedoGetDto> redoGetDtoList= redoService.returnRedoList(redoPostDto);
        return ResponseEntity.ok(redoGetDtoList);
    }
}
