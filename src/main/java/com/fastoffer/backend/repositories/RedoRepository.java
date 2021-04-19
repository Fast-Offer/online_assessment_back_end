package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.RedoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface RedoRepository extends JpaRepository<RedoEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT count(*) from Redo r where r.redo_interviewee_id = :intervieweeId and r.redo_question_id =:questionId")
    int countByIntervieweeAccountEntityAndQuestionEntity(@Param("intervieweeId")UUID intervieweeId, @Param("questionId")UUID questionId);

    @Modifying
    @Query(nativeQuery = true, value = "delete from Redo r where r.redo_interviewee_id = :intervieweeId and r.redo_question_id =:questionId")
    void deleteByQuestionId(@Param("intervieweeId")UUID intervieweeId, @Param("questionId")UUID questionId);


}
