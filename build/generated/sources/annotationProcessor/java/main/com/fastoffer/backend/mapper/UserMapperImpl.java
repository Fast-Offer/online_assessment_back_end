package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.signup.SignupPostDto;
import com.fastoffer.backend.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T22:00:04+1100",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.7.jar, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity fromEntity(SignupPostDto signupPostDto) {
        if ( signupPostDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setEmail( signupPostDto.getEmail() );
        userEntity.setPassword( signupPostDto.getPassword() );

        return userEntity;
    }
}
