package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.FavEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FavRepository extends JpaRepository<FavEntity, UUID> {
}
