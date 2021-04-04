package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.IntervieweeGetDto;
import com.fastoffer.backend.dtos.IntervieweePostDto;
import com.fastoffer.backend.entities.IntervieweeEntity;
import com.fastoffer.backend.repositories.IntervieweeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntervieweeService {

    @Autowired
    IntervieweeRepository intervieweeRepository;

    public IntervieweeGetDto createIntervieweeProfile(IntervieweePostDto intervieweePostDto) {
        IntervieweeEntity intervieweeEntity = this.mapPostDtoToEntity(intervieweePostDto);
        IntervieweeEntity savedIntervieweeEntity = intervieweeRepository.save(intervieweeEntity);

        IntervieweeGetDto intervieweeGetDto = this.mapEntityToGetDto(savedIntervieweeEntity);

        return intervieweeGetDto;
    }

    private IntervieweeEntity mapPostDtoToEntity(IntervieweePostDto intervieweePostDto) {
        IntervieweeEntity intervieweeEntity = new IntervieweeEntity();

        intervieweeEntity.setName(intervieweePostDto.getName());
        intervieweeEntity.setAge(intervieweePostDto.getAge());
        intervieweeEntity.setAvatar(intervieweePostDto.getAvatar());
        intervieweeEntity.setSelf_introduction(intervieweePostDto.getSelf_introduction());
        intervieweeEntity.setPhone(intervieweePostDto.getPhone());
        intervieweeEntity.setWebsite(intervieweePostDto.getWebsite());
        intervieweeEntity.setLocation(intervieweePostDto.getLocation());

        return intervieweeEntity;
    }

    private IntervieweeGetDto mapEntityToGetDto(IntervieweeEntity intervieweeEntity) {
        IntervieweeGetDto intervieweeGetDto = new IntervieweeGetDto();

        intervieweeGetDto.setInterviewee_id(intervieweeEntity.getInterviewee_id().toString());
        intervieweeGetDto.setName(intervieweeEntity.getName());

        return intervieweeGetDto;
    }
}
