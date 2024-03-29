package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;


@Setter
@Entity
@Getter
@Table(name = "redo")
public class RedoEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
//    @Type(type="pg-uuid")
    private UUID redoId;

    @ManyToOne
    @JoinColumn(name = "redo_interviewee_id", referencedColumnName = "interviewee_id")
    private IntervieweeAccountEntity intervieweeAccountEntity;

    @ManyToOne
    @JoinColumn(name = "redo_question_id", referencedColumnName = "question_id")
    private QuestionEntity questionEntity;

    @Column(name = "time_stamp", nullable = false)
    private Timestamp timeStamp;
}
