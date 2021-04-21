package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Fav.FavQuestionGetDto;
import com.fastoffer.backend.entities.FavQuestionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FavQuestionMapper {
    FavQuestionGetDto fromEntity(FavQuestionEntity favQuestionEntity);
}
