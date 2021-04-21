package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Redo.RedoDeleteGetDto;
import com.fastoffer.backend.dtos.Redo.RedoDeletePostDto;
import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.entities.RedoQuestionEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.mapper.RedoQuestionMapper;

import com.fastoffer.backend.repositories.RedoQuestionRepository;
import com.fastoffer.backend.repositories.RedoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class RedoService {

    private final RedoQuestionRepository redoQuestionRepository;
    private final RedoQuestionMapper redoQuestionMapper;
    private final RedoRepository redoRepository;

    public List<RedoGetDto> returnRedoList(RedoPostDto redoPostDto) {

        Set<RedoQuestionEntity> questionSet = redoQuestionRepository.findQuestionIdByUserId(redoPostDto.getId());
        //从redo表中拿到这个用户的题目

        return questionSet.stream().map(question -> redoQuestionMapper.fromEntity(question)).collect(Collectors.toList());
    }

    public RedoDeleteGetDto deleteRedoQuestion(RedoDeletePostDto redoDeletePostDto) {
        if(redoRepository.countByIntervieweeAccountEntityAndQuestionEntity(redoDeletePostDto.getIntervieweeID(),
                redoDeletePostDto.getQuestionId()) == 1) {
            redoRepository.deleteByQuestionId(redoDeletePostDto.getIntervieweeID(), redoDeletePostDto.getQuestionId());
            RedoDeleteGetDto redoDeleteGetDto = new RedoDeleteGetDto();
            redoDeleteGetDto.setStatus("successful");
            return redoDeleteGetDto;
        }
        throw new InvalidAccountException("question or account does not exist");
    }
}


