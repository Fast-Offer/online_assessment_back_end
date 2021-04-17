package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Setter
@Getter
public class FavQuestionEntity {
    @Id
    private UUID questionId;
    private String title;
    private String category;
}
