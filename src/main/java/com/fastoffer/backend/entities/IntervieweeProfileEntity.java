package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "interviewee_profile")

public class IntervieweeProfileEntity {
    @Id
    private UUID profile_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_interviewee_id", referencedColumnName = "interviewee_id")
    private IntervieweeAccountEntity intervieweeAccountEntity;

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