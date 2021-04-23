package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.QuestionMapper;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionGetDto getQuestion(QuestionPostDto questionPostDto) {
        QuestionEntity questionEntity = questionRepository.findByQuestionId(questionPostDto.getQuestionId());

        return  questionMapper.fromEntity(questionEntity);
    }

    public List<QuestionGetDto> getQuestionsByCollectionId(UUID collectionId) {


        return Arrays.asList(
                new QuestionGetDto(
                        UUID.fromString("077db05e-f4e0-49fd-8b68-3cb4b5c094b2"),
                        "Which operator is used to multiply numbers?", "#", "$", "*", "X"),
                new QuestionGetDto(
                        UUID.fromString("0602196e-3d5e-4ad5-94c6-e2c7d624cf3a"),
                        "How do you call a method in Java?",
                        "methodName()", "(methodName)", "methodName[]", "methodName.")
        );
    }

}
