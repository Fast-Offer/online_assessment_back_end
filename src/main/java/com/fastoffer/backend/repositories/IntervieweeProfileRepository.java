package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.IntervieweeProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IntervieweeProfileRepository extends JpaRepository<IntervieweeProfileEntity, UUID> {
//    @Query(nativeQuery = true, value = "SELECT Cast(profile_id as varchar) profile_id FROM " +
//            "interviewee_profile u WHERE u.profile_interviewee_id = :id")
//    List<UUID[]> existsByIntervieweeAccountId(@Param("id") UUID intervieweeAccountId);
}
