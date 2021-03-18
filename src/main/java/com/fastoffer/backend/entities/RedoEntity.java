package com.fastoffer.backend.entities;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Setter
@Getter
@Table(name = "redo")

public class RedoEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    private UUID id;

    @OneToOne(mappedBy = "user")
    @JoinColumn(name="user_id",referencedColumnName="id")
    private UserEntity userEntity;
    //@joincolumn 中name的属性对用数据库中的字段user_id,
    // referencedColumn Name属性对应关联表的主键

    @Column(name="user_id", unique = true, nullable = false)
    private UUID user_id;


    @OneToMany(mappedBy = "question")
    @JoinColumn(name = "question_id",referencedColumnName = "id")
    private QuestionEntity questionEntity;

    @Column(name="question_id", unique = true, nullable = false)
    private UUID question_id;




}
