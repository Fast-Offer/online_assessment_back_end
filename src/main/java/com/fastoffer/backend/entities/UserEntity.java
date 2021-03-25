package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "user_account")
public class UserEntity {
    @Id
//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name="uuid2",strategy="uuid2")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",updatable = false, nullable = false)
    @org.hibernate.annotations.Type(type="pg-uuid")
    private UUID id;

    @Column(name="email", unique = true)
    private String email;
    @Column(name="password", unique = false)
    private String password;

    @ManyToMany(mappedBy = "userEntities")
    private Set<QuestionEntity> questionEntities;




}
