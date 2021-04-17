package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "interviewee_account")
public class IntervieweeAccountEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    @Column(name = "interviewee_id", nullable = false)
    private UUID accountId;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "intervieweeAccountEntity")
//    @PrimaryKeyJoinColumn(name = "interviewee_id", referencedColumnName = "profile_id")
    private IntervieweeProfileEntity profileEntity;
    
    @OneToMany(mappedBy = "intervieweeAccountEntity")
    private Set<RedoEntity> redoEntitySet;

    @OneToMany(mappedBy = "intervieweeAccountEntity")
    private Set<FavEntity> favEntities;

    @OneToMany(mappedBy = "intervieweeAccountEntity")
    private Set<BugEntity> bugEntities;
}
