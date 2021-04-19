package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Practice.PracticeGetDto;
import com.fastoffer.backend.dtos.Practice.PracticePostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.PracticeMapper;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PracticeService {
    private final QuestionRepository questionRepository;

    private final PracticeMapper practiceMapper;

    public PracticeGetDto findCorrectOption(PracticePostDto practicePostDto) {
        QuestionEntity questionEntity = questionRepository.findByQuestionId(practicePostDto.getQuestionId());
        return practiceMapper.fromEntity(questionEntity);
    }
}
