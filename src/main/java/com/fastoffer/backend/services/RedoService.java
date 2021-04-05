package com.fastoffer.backend.services;


import com.fastoffer.backend.dtos.*;
import com.fastoffer.backend.repositories.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RedoService {
    @Autowired
    QuestionRepository questionRepository;

    public List<RedoGetDto> returnRedoList(RedoPostDto redoPostDto) {

        List<Object[]> questionEntityObjectList;
        List<RedoGetDto> redoGetDtoList = new ArrayList<>();
        if (questionRepository.existByUserId(redoPostDto.getId())) {
            //先检测redo表中是否存在该id
            questionEntityObjectList = questionRepository.findByUserId(redoPostDto.getId());

            for (Object[] q : questionEntityObjectList) {
                RedoGetDto redoGetDto = new RedoGetDto();
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        redoGetDto.setId((String) q[i]);
                    } else if (i == 1) {
                        redoGetDto.setTitle((String) q[i]);
                    } else {
                        redoGetDto.setCategory((String) q[i]);
                    }
                }
                redoGetDtoList.add(redoGetDto);
            }
        } else {
            RedoGetDto redoGetDto = new RedoGetDto();
            redoGetDto.setStatus("not exist redo question");
            redoGetDtoList.add(redoGetDto);
        }
        return redoGetDtoList;
    }


}


