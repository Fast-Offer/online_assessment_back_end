package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IntervieweeRepository extends JpaRepository<IntervieweeEntity, UUID> {

}
