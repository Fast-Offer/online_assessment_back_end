package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.entities.RedoQuestionEntity;
import com.fastoffer.backend.mapper.RedoQuestionMapper;

import com.fastoffer.backend.repositories.RedoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RedoService {

    private final RedoRepository redoRepository;
    private final RedoQuestionMapper redoQuestionMapper;

    public List<RedoGetDto> returnRedoList(RedoPostDto redoPostDto) {

        Set<RedoQuestionEntity> questionSet = redoRepository.findQuestionIdByUserId(redoPostDto.getId());
        //从redo表中拿到这个用户的题目

        return questionSet.stream().map(question -> redoQuestionMapper.fromEntity(question)).collect(Collectors.toList());
    }


//    public RedoGetDto deleteQuestion(RedoPostDto redoPostDto) {
//
//    }
}


