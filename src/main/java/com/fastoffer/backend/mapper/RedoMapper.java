package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.dtos.Signup.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.entities.RedoEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RedoMapper {


    RedoEntity toEntity(RedoPostDto redoPostDto);
    RedoGetDto fromEntity(RedoEntity redoEntity);

}
