package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "fav")
@Getter
@Setter
public class FavEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "interviewee_account_id", unique = false, nullable = false)
    private IntervieweeAccountEntity intervieweeAccountEntity;

    @ManyToOne
    @JoinColumn(name = "question_id" )
    private QuestionEntity questionEntity;

    @Column(name = "timestamp")
    @CreationTimestamp
    private Timestamp timestamp;
}
