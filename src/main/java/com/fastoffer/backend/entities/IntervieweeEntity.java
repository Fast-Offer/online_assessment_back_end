package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "interviewee")

public class IntervieweeEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")

    private UUID id;
    @Column(name="email", unique = true, nullable = false)
    private String email;
    @Column(name="password", unique = false, nullable = false)
    private String password;
}
