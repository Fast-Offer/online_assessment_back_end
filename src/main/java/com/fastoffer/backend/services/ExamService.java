package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Exam.ExamGetDto;
import com.fastoffer.backend.dtos.Exam.ExamPostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.ExamMapper;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final QuestionRepository questionRepository;

    private final ExamMapper examMapper;

    public ExamGetDto findCorrectOption(ExamPostDto examPostDto) {
        QuestionEntity questionEntity = questionRepository.findByQuestionId(examPostDto.getQuestionId());
        return examMapper.fromEntity(questionEntity);
    }
}
