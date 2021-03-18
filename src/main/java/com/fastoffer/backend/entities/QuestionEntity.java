package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "question")

public class QuestionEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    private UUID id;

    @Column(name="name",  nullable = false)
    private String name;

    @Column(name="content",  nullable = false)
    private String content;

//    @OneToMany(mappedBy = "creator")
//    @JoinColumn(name = "creator_id", referencedColumnName = "creator")
//
//
//    @Column(name="creator_id")
//    private UUID creator;
//
//    @Column(name="comment_id")
//    private UUID comment_id;
//
//    @Column(name="bug_id")
//    private UUID bug_id;



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

    @Column(name = "created_time", nullable = false)
    private Date created_time;



}
