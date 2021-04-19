package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.QuestionMapper;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;

    public QuestionGetDto getQuestion(QuestionPostDto questionPostDto) {
        QuestionEntity questionEntity = questionRepository.findByQuestionId(questionPostDto.getQuestionId());

        return  questionMapper.fromEntity(questionEntity);
    }

//    public QuestionGetDto deleteQuestion(QuestionPostDto questionPostDto) {
//        questionRepository.deleteById(questionPostDto.getQuestionId());
//        QuestionGetDto questionGetDto = new QuestionGetDto();
//        questionGetDto.setQuestionId(questionPostDto.getQuestionId());
//        return questionGetDto;
//    }
}
