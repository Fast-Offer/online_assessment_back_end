package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<IntervieweeAccountEntity, UUID> {
    IntervieweeAccountEntity findByEmail(String Email);
    boolean existsByEmail(String Email);

}
