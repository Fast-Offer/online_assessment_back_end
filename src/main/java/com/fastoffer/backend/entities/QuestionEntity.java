package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "question")
public class QuestionEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    @Column(name = "question_id")
    private UUID questionId;

    @Column(name="creator",  nullable = false)
    private String creator;

    @Column(name="title",  nullable = false)
    private String title;

    @Column(name = "option_a", nullable = false)
    private String optionA;

    @Column(name = "option_b", nullable = false)
    private String optionB;

    @Column(name = "option_c", nullable = false)
    private String optionC;

    @Column(name = "option_d", nullable = false)
    private String optionD;

    @Column(name = "correct_option", nullable = false)
    private String correctOption;

    @Column(name = "explanation", nullable = false)
    private String explanation;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "created_time", nullable = false)
    private Timestamp createdTime;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "questionEntity")
    private Set<RedoEntity> redoEntitySet;

    @OneToMany(mappedBy = "questionEntity")
    private Set<FavEntity> favEntities;

    @OneToMany(mappedBy = "questionEntity")
    private Set<BugEntity> bugEntities;
}
