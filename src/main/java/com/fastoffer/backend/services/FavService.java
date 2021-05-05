package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Fav.FavDeleteGetDto;
import com.fastoffer.backend.dtos.Fav.FavDeletePostDto;
import com.fastoffer.backend.dtos.Fav.FavGetDto;
import com.fastoffer.backend.dtos.Fav.FavPostDto;

import com.fastoffer.backend.entities.FavEntity;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.entities.QuestionEntity;
import com.fastoffer.backend.exceptions.InvalidAccountException;
import com.fastoffer.backend.repositories.FavRepository;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import com.fastoffer.backend.repositories.QuestionRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
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
        IntervieweeAccountEntity intervieweeAccountEntity = intervieweeAccountRepository.findById(favPostDto.getAccountID()).get();
        QuestionEntity questionEntity = questionRepository.findById(favPostDto.getQuestionID()).get();
        favEntity.setIntervieweeAccountEntity(intervieweeAccountEntity);
        favEntity.setQuestionEntity(questionEntity);

        return favEntity;
    }

    private FavGetDto mapEntityToGetDto (FavEntity favEntity) {
        FavGetDto favGetDto = new FavGetDto();
        favGetDto.setQuestionId(favEntity.getQuestionEntity().getQuestionId());
        favGetDto.setIntervieweeAccountId(favEntity.getIntervieweeAccountEntity().getAccountId());
        favGetDto.setId(favEntity.getId());
        favGetDto.setTimestamp(favEntity.getTimestamp());

        return favGetDto;
    }

    public FavDeleteGetDto deleteFavQuestion(FavDeletePostDto favDeletePostDto) {
        if(favRepository.countByIntervieweeAccountEntityAndQuestionEntity(favDeletePostDto.getIntervieweeID(),
                favDeletePostDto.getQuestionID()) == 1) {
            favRepository.deleteByQuestionId(favDeletePostDto.getIntervieweeID(), favDeletePostDto.getQuestionID());
            FavDeleteGetDto favDeleteGetDto = new FavDeleteGetDto();
            favDeleteGetDto.setStatus("successful");
            return favDeleteGetDto;
        }
        throw new InvalidAccountException("question or account does not exist");
    }
}
