package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.redo.RedoGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.UUID;

/**
 * @Auther: Elton Ge
 * @Date: 23/3/21
 * @Description: com.fastoffer.backend.mapper
 * @version: 1.0
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RedoQuestionsMapper {

    RedoGetDto redoToGetDTO(QuestionEntity questionEntity);
}
