package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.ResponseResults;
import com.fastoffer.backend.dtos.signup.SignupPostDto;
import com.fastoffer.backend.entities.UserEntity;
import com.fastoffer.backend.mapper.UserMapper;
import com.fastoffer.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.UUID;


@Service
public class SignupService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public ResponseResults createUser(SignupPostDto signupPostDto) {
        UserEntity userCheck = userRepository.findByEmail(signupPostDto.getEmail());
        if (userCheck != null) {
            return ResponseResults.error("email has existed, please change another one or retry to login");
        }
        UserEntity userEntity = userMapper.fromEntity(signupPostDto);
        String password = userEntity.getPassword();
        String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
        userEntity.setPassword(md5DigestAsHex);
        UserEntity save = userRepository.save(userEntity);
        if (save != null) {
            return ResponseResults.ok();
        }
        return ResponseResults.error("signup failed");
    }

}
