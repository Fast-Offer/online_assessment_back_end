package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "report_bug")
@Getter
@Setter
public class BugEntity {

   @Id
   @Column( name = "bug_id")
   @GeneratedValue(generator = "uuid2")
   @GenericGenerator(name = "uuid2", strategy = "uuid2")
   private UUID id;

   @ManyToOne
   @JoinColumn(name = "reporter")
   private IntervieweeAccountEntity intervieweeAccountEntity;

   @ManyToOne
   @JoinColumn(name = "question_id")
   private QuestionEntity questionEntity;

   @Column( name = "report_time")
   @CreationTimestamp
   private Timestamp timestamp;

   @Column( name = "description")
   private String description;
}
