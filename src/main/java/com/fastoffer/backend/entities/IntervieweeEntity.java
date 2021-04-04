package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "interviewee_profile")

public class IntervieweeEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID interviewee_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "self_introduction")
    private String self_introduction;

    @Column(name = "phone")
    private String phone;

    @Column(name = "website")
    private String website;

    @Column(name = "location")
    private String location;
}