package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.mapper.RedoQuestionMapper;

import com.fastoffer.backend.repositories.RedoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RedoService {

//    private final QuestionRepository questionRepository;
    private final RedoRepository redoRepository;
    private final RedoQuestionMapper redoQuestionMapper;
//    private final IntervieweeAccountRepository intervieweeAccountRepository;

    public List<RedoGetDto> returnRedoList(RedoPostDto redoPostDto) {

        List<Object[]> questionList = redoRepository.findQuestionIdByUserId(redoPostDto.getId());
        //从redo表中拿到这个用户的题目
        List<RedoGetDto> redoGetDtoList = new ArrayList<>();

//        questionList.stream().map(question -> redoGetDtoList.set(question)).collect()
//
//        for (UUID[] questionId: questionIdList) {
//            List<QuestionEntity> allById = questionRepository.findAllById(Arrays.asList(questionId.clone()));
//            for (QuestionEntity questionEntity : allById) {
//                RedoGetDto redoGetDto =  redoQuestionMapper.fromEntity(questionEntity);
//                redoGetDtoList.add(redoGetDto);
//            }
//        }

        return redoGetDtoList;
    }

}


