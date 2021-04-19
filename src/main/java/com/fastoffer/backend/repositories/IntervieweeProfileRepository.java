package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface IntervieweeProfileRepository extends JpaRepository<IntervieweeProfileEntity, UUID> {
//    @Modifying
//    @Query(nativeQuery = true, value = "UPDATE profile_id SET interviewee_id = :accountId WHERE  = :accountId")
//    void modifyIntervieweeProfileId(@Param("profileId")UUID intervieweeId,@Param("accountId")UUID accountId);
}
