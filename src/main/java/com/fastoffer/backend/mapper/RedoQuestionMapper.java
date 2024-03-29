package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.entities.RedoQuestionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RedoQuestionMapper {
    RedoGetDto fromEntity(RedoQuestionEntity redoQuestionEntity);
}
