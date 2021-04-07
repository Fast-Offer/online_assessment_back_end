package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;


@Setter
@Entity
@Getter
@Table(name = "redo")
public class RedoEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String redo_id;

    @ManyToOne
    @JoinColumn(name = "redo_interviewee_id", referencedColumnName = "interviewee_id")
    private IntervieweeAccountEntity intervieweeAccountEntity;

    @ManyToOne
    @JoinColumn(name = "redo_question_id", referencedColumnName = "question_id")
    private QuestionEntity questionEntity;

    @Column(name = "time_stamp", nullable = false)
    private Timestamp time_stamp;
}
