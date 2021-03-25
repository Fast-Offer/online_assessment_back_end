package com.fastoffer.backend.services;


import com.fastoffer.backend.dtos.redo.RedoGetDto;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.mapper.RedoQuestionsMapper;
import com.fastoffer.backend.repositories.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RedoService {
    @Autowired
    private  QuestionRepository questionRepository;
    @Autowired
    private RedoQuestionsMapper redoQuestionsMapper;

    public List<RedoGetDto> getRedoList(UUID uid) {
        List<UUID[]> byUserId = questionRepository.findEverythingByUserId(uid);
        List<RedoGetDto> redoGetDtoList = new ArrayList<>();
        for (UUID[] uuids : byUserId) {
            List<QuestionEntity> allById = questionRepository.findAllById(Arrays.asList(uuids.clone()));
            for (QuestionEntity questionEntity : allById) {
                RedoGetDto redoGetDto = redoQuestionsMapper.redoToGetDTO(questionEntity);
                redoGetDto.setId(questionEntity.getId().toString());
                redoGetDto.setTitle(questionEntity.getTitle());
                redoGetDto.setCategory(questionEntity.getCategory());
                redoGetDtoList.add(redoGetDto);
            }
        }
        return redoGetDtoList;
    }
}


