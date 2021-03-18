package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    public UserEntity findByEmail(String Email);
    public boolean existsByEmail(String Email);

}
