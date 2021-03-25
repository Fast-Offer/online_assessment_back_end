package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.QuestionEntity;

import com.fastoffer.backend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT Cast(question_id as varchar) question_id FROM " +
            "QUESTION q ,redo r WHERE r.user_id = :id AND r.question_id= q.id ")
    List<UUID[]> findEverythingByUserId(@Param("id") UUID id);


}

