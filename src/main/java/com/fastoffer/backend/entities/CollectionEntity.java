package com.fastoffer.backend.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "collection")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CollectionEntity {

    @Id
    @Column(name = "collectionid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID collectionId;

    @Column(name = "creator")
    private UUID creator;

    @Column(name = "imageurl")
    private String imageUrl;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "timecost")
    private String timeCost;

    @Column(name = "ispublic")
    private boolean isPublic;

    @Column(name = "category")
    private String category;

    @Column(name = "type")
    private String type;

    @Column(name = "questionlist")
    private String questionList;
}
