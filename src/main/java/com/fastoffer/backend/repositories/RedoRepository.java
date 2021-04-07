package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.RedoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RedoRepository extends JpaRepository <RedoEntity, UUID> {
    @Query(nativeQuery = true, value = "SELECT Cast(question_id as varchar) question_id FROM " +
            "redo r WHERE r.user_id = :id")
    List<UUID[]> findQuestionIdByUserId(@Param("id") UUID id);

//    public boolean existsByIntervieweeAccountEntity(UUID account_id);
}
