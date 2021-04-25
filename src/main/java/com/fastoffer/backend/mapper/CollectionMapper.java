package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.Collection.CollectionGetDto;
import com.fastoffer.backend.entities.CollectionEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CollectionMapper {
    CollectionGetDto fromEntity(CollectionEntity collectionEntity);
}
