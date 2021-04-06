package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Redo.RedoGetDto;
import com.fastoffer.backend.dtos.Redo.RedoPostDto;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import com.fastoffer.backend.repositories.QuestionRepository;

import com.fastoffer.backend.repositories.RedoRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RedoService {

    private final QuestionRepository questionRepository;
    private final RedoRepository redoRepository;
//    private final IntervieweeAccountRepository intervieweeAccountRepository;

    public List<RedoGetDto> returnRedoList(RedoPostDto redoPostDto) {
//        return questionRepository.findAllById(redoPostDto.)
        List<UUID[]> questionIdList = redoRepository.findQuestionIdByUserId(redoPostDto.getId());
        List<RedoGetDto> redoGetDtoList = new ArrayList<>();

        if(questionIdList.isEmpty()) {
            return redoGetDtoList;
        }

        for (UUID[] uuids: questionIdList) {
            List<QuestionEntity> allById = questionRepository.findAllById(Arrays.asList(uuids.clone()));
            for (QuestionEntity questionEntity : allById) {
                RedoGetDto redoGetDto = redoQuestionsMapper.redoToGetDTO(questionEntity);
                redoGetDto.setId(questionEntity.getId().toString());
                redoGetDto.setTitle(questionEntity.getTitle());
                redoGetDto.setCategory(questionEntity.getCategory());
                redoGetDtoList.add(redoGetDto);
            }
        }

        if (questionRepository.exi(redoPostDto.getId())) {

            //先检测redo表中是否存在该id
        questionEntityObjectList = questionRepository.findByUserId(redoPostDto.getId());

//            for (Object[] q : questionEntityObjectList) {
//                RedoGetDto redoGetDto = new RedoGetDto();
//                for (int i = 0; i < 3; i++) {
//                    if (i == 0) {
//                        redoGetDto.setId((String) q[i]);
//                    } else if (i == 1) {
//                        redoGetDto.setTitle((String) q[i]);
//                    } else {
//                        redoGetDto.setCategory((String) q[i]);
//                    }
//                }
//                redoGetDtoList.add(redoGetDto);
//            }
        } else {
            RedoGetDto redoGetDto = new RedoGetDto();
            redoGetDto.setStatus("not exist redo question");
            redoGetDtoList.add(redoGetDto);
        }
        return redoGetDtoList;
    }
}


