package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExamRepository extends JpaRepository<QuestionEntity, UUID> {

}
