package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    UserEntity findByEmail(String Email);
//    UserEntity findAllByEmailContains(String email);
}
