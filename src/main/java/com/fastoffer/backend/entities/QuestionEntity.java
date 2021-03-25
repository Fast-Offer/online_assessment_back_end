package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "question")
public class QuestionEntity {
    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name="uuid2",strategy="uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @org.hibernate.annotations.Type(type="pg-uuid")
    @Column(name = "id",updatable = false, nullable = false)
    private UUID id;

    @ManyToMany
    @JoinTable(
            name = "redo",
            joinColumns = @JoinColumn(name = "question_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"))
    private Set<UserEntity> userEntities;

    @Column(name="name",  nullable = false)
    private String name;



    @Column(name = "title", nullable = false )
    private String title;

    @Column(name = "optionA", nullable = false)
    private String optionA;

    @Column(name = "optionB", nullable = false)
    private String optionB;

    @Column(name = "optionC", nullable = false)
    private String optionC;

    @Column(name = "optionD", nullable = false)
    private String optionD;

    @Column(name = "correct_option", nullable = false)
    private String correct_option;

    @Column(name = "explanation", nullable = false)
    private String explanation;

 

    @Column(name = "category")
    private String category;



}
