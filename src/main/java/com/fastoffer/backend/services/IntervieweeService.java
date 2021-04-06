//package com.fastoffer.backend.services;
//
//import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfileGetDto;
//import com.fastoffer.backend.dtos.IntervieweeProfile.IntervieweeProfilePostDto;
//import com.fastoffer.backend.entities.IntervieweeAccountEntity;
//import com.fastoffer.backend.entities.IntervieweeProfileEntity;
//import com.fastoffer.backend.exceptions.InvalidAccountException;
//import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
//
//import com.fastoffer.backend.repositories.IntervieweeProfileRepository;
//import lombok.RequiredArgsConstructor;
//
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class IntervieweeService {
//
//    private final IntervieweeAccountRepository intervieweeAccountRepository;
//
//    private final IntervieweeProfileRepository intervieweeProfileRepository;
//
//    public IntervieweeProfileGetDto editIntervieweeProfile(IntervieweeProfilePostDto intervieweeProfilePostDto) {
//
//        if(intervieweeAccountRepository.existsById(intervieweeProfilePostDto.getInterviewee_id())) {
//            IntervieweeProfileEntity intervieweeProfileEntity = this.mapPostDtoToEntity(intervieweeProfilePostDto);
//            IntervieweeProfileEntity savedIntervieweeProfileEntity = intervieweeProfileRepository.save(intervieweeProfileEntity);
//            IntervieweeProfileGetDto intervieweeProfileGetDto = this.mapEntityToGetDto(savedIntervieweeProfileEntity);
//            return intervieweeProfileGetDto;
//        }
//        throw new InvalidAccountException("Invalid operation");
//    }
//
//    private IntervieweeProfileEntity mapPostDtoToEntity(IntervieweeProfilePostDto intervieweeProfilePostDto) {
//        IntervieweeProfileEntity intervieweeProfileEntity = new IntervieweeProfileEntity();
//
//        intervieweeProfileEntity.setName(intervieweeProfilePostDto.getName());
//        intervieweeProfileEntity.setAge(intervieweeProfilePostDto.getAge());
//        intervieweeProfileEntity.setAvatar(intervieweeProfilePostDto.getAvatar());
//        intervieweeProfileEntity.setSelf_introduction(intervieweeProfilePostDto.getSelf_introduction());
//        intervieweeProfileEntity.setPhone(intervieweeProfilePostDto.getPhone());
//        intervieweeProfileEntity.setWebsite(intervieweeProfilePostDto.getWebsite());
//        intervieweeProfileEntity.setLocation(intervieweeProfilePostDto.getLocation());
//
//        return intervieweeProfileEntity;
//    }
//
//    private IntervieweeProfileGetDto mapEntityToGetDto(IntervieweeProfileEntity intervieweeProfileEntity) {
//        IntervieweeProfileGetDto intervieweeProfileGetDto = new IntervieweeProfileGetDto();
//
//        intervieweeProfileGetDto.setName(intervieweeProfileEntity.getName());
//        intervieweeProfileGetDto.setAge(intervieweeProfileEntity.getAge());
//        intervieweeProfileGetDto.setAvatar(intervieweeProfileEntity.getAvatar());
//        intervieweeProfileGetDto.setSelf_introduction(intervieweeProfileEntity.getSelf_introduction());
//        intervieweeProfileGetDto.setPhone(intervieweeProfileEntity.getPhone());
//        intervieweeProfileGetDto.setWebsite(intervieweeProfileEntity.getWebsite());
//        intervieweeProfileGetDto.setLocation(intervieweeProfileEntity.getLocation());
//
//        return intervieweeProfileGetDto;
//    }
//}
