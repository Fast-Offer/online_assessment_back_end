package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.Bug.BugGetDto;
import com.fastoffer.backend.dtos.Bug.BugPostDto;
import com.fastoffer.backend.entities.BugEntity;
import com.fastoffer.backend.repositories.BugRepository;
import com.fastoffer.backend.repositories.QuestionRepository;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BugServices {

    private final BugRepository bugRepository;

    private final IntervieweeAccountRepository intervieweeAccountRepository;

    private final QuestionRepository questionRepository;

    public BugGetDto createBug(BugPostDto bugPostDto) {
        BugEntity bugEntity = mapPostDtoToEntity(bugPostDto);
        BugEntity savedBugEntity = bugRepository.save(bugEntity);

        return mapEntityToGetDto(savedBugEntity);
    }

    private BugEntity mapPostDtoToEntity(BugPostDto bugPostDto) {
        BugEntity bugEntity = new BugEntity();
        bugEntity.setIntervieweeAccountEntity(intervieweeAccountRepository.findById(bugPostDto.getAccountID()).get());
        bugEntity.setQuestionEntity(questionRepository.findById(bugPostDto.getQuestionID()).get());
        bugEntity.setDescription(bugPostDto.getBugContent());

        return bugEntity;
    }

    private BugGetDto mapEntityToGetDto(BugEntity bugEntity) {
        BugGetDto bugGetDto = new BugGetDto();
        bugGetDto.setId(bugEntity.getId());
        bugGetDto.setReporter(bugEntity.getIntervieweeAccountEntity().getAccountId());
        bugGetDto.setQuestionID(bugEntity.getQuestionEntity().getQuestionId());
        bugGetDto.setReportTime(bugEntity.getTimestamp());

        return bugGetDto;
    }


}
