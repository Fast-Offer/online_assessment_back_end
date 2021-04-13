package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Setter
@Entity
@Getter
public class RedoQuestionEntity {
    @Id
    private UUID questionId;
    private String title;
    private String category;
}
