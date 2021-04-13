package com.fastoffer.backend.services;

import com.fastoffer.backend.entities.CollectionEntity;
import com.fastoffer.backend.repositories.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CollectionService {

    private final CollectionRepository collectionRepository;

    public List<CollectionEntity> getAllPublicCollections() {
        return collectionRepository.findCollectionEntitiesByIsPublicIsTrue();
    }
}
