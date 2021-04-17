package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Exam.ExamGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ExamMapper {

    ExamGetDto fromEntity(QuestionEntity questionEntity);
}
