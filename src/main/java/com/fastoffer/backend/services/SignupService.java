package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.SignupGetDto;
import com.fastoffer.backend.dtos.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeEntity;
import com.fastoffer.backend.repositories.IntervieweeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    IntervieweeRepository intervieweeRepository;

    public EgoResults createInterviewee(SignupPostDto signupPostDto) {
        EgoResults egoResults;

        IntervieweeEntity intervieweeEntity = this.mapPostDtoToEntity(signupPostDto);

        if(intervieweeRepository.existsByEmail(signupPostDto.getEmail())){
            SignupGetDto failInterviewGetDto = new SignupGetDto();
            failInterviewGetDto.setResult("already exist email");
            egoResults = EgoResults.error(failInterviewGetDto.getResult());
            return egoResults;
        } else {
            IntervieweeEntity savedInterviewEntity = intervieweeRepository.save(intervieweeEntity);
            SignupGetDto signupGetDto = this.mapEntityToGetDto(savedInterviewEntity);
            signupGetDto.setResult("successfully");
            egoResults = EgoResults.ok(signupGetDto);
            return egoResults;
        }
}

    private IntervieweeEntity mapPostDtoToEntity(SignupPostDto signupPostDto){
        IntervieweeEntity intervieweeEntity = new IntervieweeEntity();
        intervieweeEntity.setEmail(signupPostDto.getEmail());
        intervieweeEntity.setPassword(signupPostDto.getPassword());
        return intervieweeEntity;
}

    private SignupGetDto mapEntityToGetDto(IntervieweeEntity intervieweeEntity){
        SignupGetDto signupGetDto = new SignupGetDto();
        signupGetDto.setId(intervieweeEntity.getId().toString());
        signupGetDto.setEmail(intervieweeEntity.getEmail());
        return signupGetDto;
    }

}
//1 名字
//2 校验
// 响应码 json文件 {注册成功} or { 失败写具体内容 查 email exist }