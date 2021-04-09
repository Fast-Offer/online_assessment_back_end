package com.fastoffer.backend.repositories;

import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfileGetDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface IntervieweeAccountRepository extends JpaRepository<IntervieweeAccountEntity, UUID> {
    IntervieweeAccountEntity findByEmail(String Email);
    boolean existsByEmail(String Email);

//    IntervieweeProfileGetDto findOneById();
//    boolean findByInterviewee_id(UUID id);
    boolean existsByIntervieweeId(UUID id);
}
