package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.QuestionEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface QuestionRepository extends JpaRepository <QuestionEntity, UUID> {

}

