package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.FavEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface FavRepository extends JpaRepository<FavEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT count(*) from fav f where f.interviewee_account_id = :intervieweeId and f.question_id =:questionId")
    int countByIntervieweeAccountEntityAndQuestionEntity(@Param("intervieweeId")UUID intervieweeId, @Param("questionId")UUID questionId);

    @Modifying
    @Query(nativeQuery = true, value = "delete from fav f where f.interviewee_account_id = :intervieweeId and f.question_id =:questionId")
    void deleteByQuestionId(@Param("intervieweeId")UUID intervieweeId, @Param("questionId")UUID questionId);
}
