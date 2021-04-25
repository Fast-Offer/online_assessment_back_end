package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.CollectionQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CollectionQuestionRepository extends JpaRepository<CollectionQuestionEntity, UUID> {

    @Query(
            value = "select cq_question_id from collection_question where cq_collection_id = :id",
            nativeQuery = true
    )
    List<UUID> myQuery(@Param("id") UUID id);

    List<CollectionQuestionEntity> findAllByCollectionEntity_CollectionId(UUID uuid);

}
