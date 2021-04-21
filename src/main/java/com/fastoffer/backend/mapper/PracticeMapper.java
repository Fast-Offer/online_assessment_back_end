package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Practice.PracticeGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface PracticeMapper {

    PracticeGetDto fromEntity(QuestionEntity questionEntity);
}
