package com.fastoffer.backend.mapper;

import com.fastoffer.backend.dtos.redo.RedoGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-23T21:59:39+1100",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.7.jar, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class RedoQuestionsMapperImpl implements RedoQuestionsMapper {

    @Override
    public RedoGetDto redoToGetDTO(QuestionEntity questionEntity) {
        if ( questionEntity == null ) {
            return null;
        }

        RedoGetDto redoGetDto = new RedoGetDto();

        return redoGetDto;
    }
}
