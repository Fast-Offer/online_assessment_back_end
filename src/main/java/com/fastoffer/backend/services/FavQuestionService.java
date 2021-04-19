package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.FavQuestion.FavQuestionGetDto;
import com.fastoffer.backend.dtos.FavQuestion.FavQuestionPostDto;
import com.fastoffer.backend.entities.FavQuestionEntity;
import com.fastoffer.backend.mapper.FavQuestionMapper;
import com.fastoffer.backend.repositories.FavQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class FavQuestionService {

    private final FavQuestionRepository favQuestionRepository;
    private final FavQuestionMapper favQuestionMapper;

    public List<FavQuestionGetDto> getFavQuestionList(FavQuestionPostDto favQuestionPostDto) {

        Set<FavQuestionEntity> questionSet = favQuestionRepository.findQuestionIdByUserId(favQuestionPostDto.getId());
        //从redo表中拿到这个用户的题目
        return questionSet.stream().map(question -> favQuestionMapper.fromEntity(question)).collect(Collectors.toList());

    }
}
