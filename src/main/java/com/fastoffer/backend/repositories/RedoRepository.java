package com.fastoffer.backend.repositories;

import com.fastoffer.backend.entities.RedoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RedoRepository extends JpaRepository <RedoEntity, UUID> {

}
