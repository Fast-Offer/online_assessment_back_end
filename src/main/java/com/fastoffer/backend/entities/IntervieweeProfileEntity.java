package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "interviewee_profile")
public class IntervieweeProfileEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "profile_id")
    private UUID profileId;

//    @Column(name = "profile_interviewee_id")
//    private UUID profile_interviewee_id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "self_introduction")
    private String selfIntroduction;

    @Column(name = "phone")
    private String phone;

    @Column(name = "website")
    private String website;

    @Column(name = "location")
    private String location;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private IntervieweeAccountEntity intervieweeAccountEntity;
}