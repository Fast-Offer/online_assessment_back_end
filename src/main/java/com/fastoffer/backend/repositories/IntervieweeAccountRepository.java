package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface IntervieweeAccountRepository extends JpaRepository<IntervieweeAccountEntity, UUID> {
    IntervieweeAccountEntity findByEmail(String email);
    boolean existsByEmail(String email);
    IntervieweeAccountEntity findByAccountId(UUID id);

//    boolean existsByAccountId(UUID id);
}
