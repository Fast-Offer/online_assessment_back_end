package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.CollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CollectionRepository extends JpaRepository<CollectionEntity, UUID> {

    @Query(value = "SELECT * FROM collection WHERE ispublic = true", nativeQuery = true)
    List<CollectionEntity> findAllCollections();

    List<CollectionEntity> findCollectionEntitiesByIsPublicIsTrue();
}
