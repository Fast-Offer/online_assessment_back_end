package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Mock.MockGetDto;
import com.fastoffer.backend.dtos.Mock.MockPostDto;
import com.fastoffer.backend.dtos.Question.QuestionGetDto;
import com.fastoffer.backend.dtos.Question.QuestionPostDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.repositories.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MockService {
    private final QuestionRepository questionRepository;

    public MockGetDto getMockAnswer(List<MockPostDto> mockPostDtoList) {
        List<QuestionEntity> questionEntityList = mockPostDtoList.stream().map(i ->
                questionRepository.findByQuestionId(i.getQuestionId())).collect(Collectors.toList());
        double correctAmount = 0;
        for(int i = 0; i < mockPostDtoList.size(); i++){
            if(mockPostDtoList.get(i).getUserAnswer().equals(questionEntityList.get(i).getCorrectOption())) {
                correctAmount++;
            }
        }
        double correctRate;
        correctRate = correctAmount / mockPostDtoList.size();
        MockGetDto mockGetDto = new MockGetDto();
        mockGetDto.setCorrectRate(correctRate);


        return mockGetDto;
    }

}
