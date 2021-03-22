package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.QuestionEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface QuestionRepository extends JpaRepository <QuestionEntity, UUID> {

    @Query(nativeQuery = true, value = "SELECT Cast(question_id as varchar) question_id, q.title, q.category FROM " +
            "QUESTION q ,redo r WHERE r.user_id = :uid AND r.question_id= q.id ")
    List<Object[]> findByUserId(@Param("uid")UUID id);

    @Query(nativeQuery = true, value = "SELECT EXISTS(SELECT Cast(user_id as varchar) user_id FROM redo WHERE user_id = :uid)")
    boolean existByUserId(@Param("uid") UUID id);

//Cast (column_name as varchar) 是为了解决java读不了UUID的报错

}

