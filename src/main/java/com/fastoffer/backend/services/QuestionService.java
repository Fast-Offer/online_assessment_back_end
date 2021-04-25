package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.entities.CollectionQuestionEntity;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.QuestionMapper;
import com.fastoffer.backend.repositories.CollectionQuestionRepository;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final CollectionQuestionRepository collectionQuestionRepository;
    private final QuestionMapper questionMapper;

    public QuestionGetDto getQuestion(QuestionPostDto questionPostDto) {
        QuestionEntity questionEntity = questionRepository.findByQuestionId(questionPostDto.getQuestionId());

        return  questionMapper.fromEntity(questionEntity);
    }

    public List<QuestionGetDto> getQuestionsByCollectionId(UUID collectionId) {
        // (1) Find all collection_question_entities first...
        List<CollectionQuestionEntity> collectionQuestionEntities =
                collectionQuestionRepository.findAllByCollectionEntity_CollectionId(collectionId);

        // (2) Collect and assemble all questionIds into an ArrayList...
        List<UUID> questionIds = new ArrayList<>();
        for (CollectionQuestionEntity a: collectionQuestionEntities
             ) {
            questionIds.add(a.getQuestionEntity().getQuestionId());
        }

        // (3) Assemble all questions by questionIds we've just got...
        List<QuestionGetDto> questionGetDtos = new ArrayList<>();
        for (UUID questionId: questionIds
             ) {
            QuestionGetDto questionGetDto =
                    questionMapper.fromEntity(questionRepository.findByQuestionId(questionId));
            questionGetDtos.add(questionGetDto);
        }

        return questionGetDtos;
    }

}
