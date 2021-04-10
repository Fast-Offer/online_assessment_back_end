package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.entities.RedoEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RedoQuestionMapper {
    RedoGetDto fromEntity(QuestionEntity questionEntity);
}
