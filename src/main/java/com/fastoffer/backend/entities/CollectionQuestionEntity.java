package com.fastoffer.backend.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "collection_question")
@Getter
@Setter
public class CollectionQuestionEntity {

    @Id
    @Column(name = "collection_question_id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID collectionQuestionId;

//    @ManyToOne
//    @JoinColumn(name = "cq_collection_id")
//    private CollectionEntity collectionEntity;
//
//    @ManyToOne
//    @JoinColumn(name = "cq_question_id")
//    private QuestionEntity questionEntity;
}
