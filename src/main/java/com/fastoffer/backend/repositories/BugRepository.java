package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.BugEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BugRepository extends JpaRepository<BugEntity, UUID>  {
}
