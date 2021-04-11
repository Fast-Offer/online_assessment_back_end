package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.FavGetDto;
import com.fastoffer.backend.dtos.FavPostDto;
import com.fastoffer.backend.entities.FavEntity;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.repositories.FavRepository;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import com.fastoffer.backend.repositories.QuestionRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FavService {

    private final FavRepository favRepository;

    private final QuestionRepository questionRepository;

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    public FavGetDto createFav(FavPostDto favPostDto) {
        FavEntity favEntity = favRepository.save(this.mapPostDtoToEntity(favPostDto));

        return mapEntityToGetDto(favEntity);
    }

    private FavEntity mapPostDtoToEntity (FavPostDto favPostDto) {
        FavEntity favEntity = new FavEntity();
        IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.findById(favPostDto.getIntervieweeID()).get();
        QuestionEntity questionEntity = questionRepository.findById(favPostDto.getQuestionID()).get();
        favEntity.setIntervieweeAccountEntity(intervieweeAccountEntity);
        favEntity.setQuestionEntity(questionEntity);

        return favEntity;
    }

    private FavGetDto mapEntityToGetDto (FavEntity favEntity) {
        FavGetDto favGetDto = new FavGetDto();
        favGetDto.setQuestion_id(favEntity.getQuestionEntity().getQuestion_id());
        favGetDto.setInterviewee_account_id(favEntity.getIntervieweeAccountEntity().getInterviewee_id());
        favGetDto.setId(favEntity.getId());
        favGetDto.setTimestamp(favEntity.getTimestamp());

        return favGetDto;
    }
}
