package com.fastoffer.backend.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "question")

public class QuestionEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2",strategy="uuid2")
    private UUID id;


    @ManyToMany
    @JoinTable(
            name = "redo",
            joinColumns = @JoinColumn(name = "question_id",referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName="id"))
    private Set<UserEntity> userEntities;
    //1、关系维护端，负责多对多关系的绑定和解除
    //2、@JoinTable注解的name属性指定关联表的名字，joinColumns指定外键的名字，关联到关系维护端(Question)
    //3、inverseJoinColumns指定外键的名字，要关联的关系被维护端(user_account)
    //4、其实可以不使用@JoinTable注解，默认生成的关联表名称为主表表名+下划线+从表表名，
    //即表名为question_user_account
    //关联到主表的外键名：主表名+下划线+主表中的主键列名,即question_id
    //关联到从表的外键名：主表中用于关联的属性名+下划线+从表的主键列名,即user_id
    //主表就是关系维护端对应的表，从表就是关系被维护端对应的表


//`    @Column(name="question_id", unique = true, nullable = false)
//    private UUID question_id;`




    @Column(name="name",  nullable = false)
    private String name;

    @Column(name="content",  nullable = false)
    private String content;

    @Column(name = "title", nullable = false )
    private String title;

    @Column(name = "optionA", nullable = false)
    private String optionA;

    @Column(name = "optionB", nullable = false)
    private String optionB;

    @Column(name = "optionC", nullable = false)
    private String optionC;

    @Column(name = "optionD", nullable = false)
    private String optionD;

    @Column(name = "correct_option", nullable = false)
    private String correct_option;

    @Column(name = "explanation", nullable = false)
    private String explanation;

    @Column(name = "created_time", nullable = false)
    private Date created_time;

    @Column(name = "category")
    private String category;



}