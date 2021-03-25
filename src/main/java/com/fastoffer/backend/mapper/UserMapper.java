package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.signup.SignupPostDto;
import com.fastoffer.backend.entities.UserEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @Auther: Elton Ge
 * @Date: 23/3/21
 * @Description: com.fastoffer.backend.mapper
 * @version: 1.0
 */
@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    UserEntity fromEntity(SignupPostDto signupPostDto);
}

