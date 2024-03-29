package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.Collection.CollectionGetDto;
import com.fastoffer.backend.entities.CollectionEntity;
import com.fastoffer.backend.services.CollectionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/collections")
@AllArgsConstructor
public class CollectionController {

    private final CollectionService collectionService;

    @GetMapping
    public List<CollectionGetDto> getCollections() {
        return collectionService.getAllPublicCollections();
    }
}
