package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.FavQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;
import java.util.UUID;

public interface FavQuestionRepository extends JpaRepository<FavQuestionEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT q.question_id , q.title, q.category  FROM " +
            "fav f LEFT JOIN question q ON f.question_id = q.question_id WHERE f.interviewee_account_id = :id")
    Set<FavQuestionEntity> findQuestionIdByUserId(@Param("id") UUID id);
}
