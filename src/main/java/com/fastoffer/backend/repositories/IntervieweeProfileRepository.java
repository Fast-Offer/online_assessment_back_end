package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IntervieweeProfileRepository extends JpaRepository<IntervieweeProfileEntity, UUID> {

}