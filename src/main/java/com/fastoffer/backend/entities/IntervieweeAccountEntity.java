package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

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
    private UUID interviewee_id;

    @Column(name="email", unique = true, nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "intervieweeAccountEntity")
    private Set<RedoEntity> redoEntitySet;
}
