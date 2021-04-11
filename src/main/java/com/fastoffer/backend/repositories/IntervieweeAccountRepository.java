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
//    boolean existsByAccountId(UUID id);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE interviewee_account SET profile_id = :profileId WHERE interviewee_id = :accountId")
    void modifyIntervieweeProfileId(@Param("profileId")UUID intervieweeId,@Param("accountId")UUID accountId);
}
