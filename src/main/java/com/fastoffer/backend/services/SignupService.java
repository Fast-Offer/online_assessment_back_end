package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.SignupGetDto;
import com.fastoffer.backend.dtos.SignupPostDto;
import com.fastoffer.backend.entities.UserEntity;
import com.fastoffer.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    UserRepository userRepository;

    public EgoResults createUser(SignupPostDto signupPostDto) {
        EgoResults egoResults;

        UserEntity userEntity = this.mapPostDtoToEntity(signupPostDto);

        if(userRepository.existsByEmail(signupPostDto.getEmail())){
            SignupGetDto failInterviewGetDto = new SignupGetDto();
            failInterviewGetDto.setResult("already exist email");
            egoResults = EgoResults.error(failInterviewGetDto.getResult());
            return egoResults;
        } else {
            UserEntity savedInterviewEntity = userRepository.save(userEntity);
            SignupGetDto signupGetDto = this.mapEntityToGetDto(savedInterviewEntity);
            signupGetDto.setResult("successfully");
            egoResults = EgoResults.ok(signupGetDto);
            return egoResults;
        }
}

    private UserEntity mapPostDtoToEntity(SignupPostDto signupPostDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(signupPostDto.getEmail());
        userEntity.setPassword(signupPostDto.getPassword());
        return userEntity;
}

    private SignupGetDto mapEntityToGetDto(UserEntity userEntity){
        SignupGetDto signupGetDto = new SignupGetDto();
        signupGetDto.setId(userEntity.getId().toString());
        signupGetDto.setEmail(userEntity.getEmail());
        return signupGetDto;
    }

}
//1 名字
//2 校验
// 响应码 json文件 {注册成功} or { 失败写具体内容 查 email exist }