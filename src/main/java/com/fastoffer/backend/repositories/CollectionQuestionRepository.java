package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.CollectionQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CollectionQuestionRepository extends JpaRepository<CollectionQuestionEntity, UUID> {

    @Query(
            value = "SELECT * FROM collection_question WHERE cq_collection_id = ?1",
            nativeQuery = true
    )
    List<CollectionQuestionEntity> findAllQuestionIdsByCollectionId(UUID uuid);

}
