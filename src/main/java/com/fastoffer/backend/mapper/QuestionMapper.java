package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface QuestionMapper {


    QuestionEntity toEntity(QuestionPostDto questionPostDto);
    QuestionGetDto fromEntity(QuestionEntity questionEntity);

}