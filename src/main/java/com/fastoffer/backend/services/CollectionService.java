package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Collection.CollectionGetDto;
import com.fastoffer.backend.entities.CollectionEntity;
import com.fastoffer.backend.mapper.CollectionMapper;
import com.fastoffer.backend.repositories.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CollectionService {

    private final CollectionRepository collectionRepository;

    private final CollectionMapper collectionMapper;

    public List<CollectionGetDto> getAllPublicCollections() {

        // (1) Get all collection entities...
        List<CollectionEntity> allCollections = collectionRepository.findAllCollections();

        // Assemble result...
        List<CollectionGetDto> collectionGetDtos = new ArrayList<>();
        for (CollectionEntity collection: allCollections
             ) {
            collectionGetDtos.add(collectionMapper.fromEntity(collection));
        }

        return collectionGetDtos;
    }
}
