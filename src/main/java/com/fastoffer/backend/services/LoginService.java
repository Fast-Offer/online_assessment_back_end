package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.LoginGetDto;
import com.fastoffer.backend.dtos.LoginPostDto;
import com.fastoffer.backend.entities.UserEntity;
import com.fastoffer.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LoginService {
    @Autowired
    UserRepository userRepository;

    public EgoResults verifyLogin(LoginPostDto loginPostDto) {
        LoginGetDto loginGetDto = new LoginGetDto();

        UserEntity userEntity = findByEmail(loginPostDto.getEmail());

        EgoResults egoResults;

        if(userRepository.existsByEmail(loginPostDto.getEmail())){
            if (userEntity.getPassword().equals( loginPostDto.getPassword())) {
                loginGetDto.setResult("match password");
                egoResults = EgoResults.ok(loginGetDto);

            } else {
                loginGetDto.setResult("wrong password");
                egoResults = EgoResults.error(loginGetDto.getResult());
            }
        } else {
            loginGetDto.setResult("not exist this Email");
            egoResults = EgoResults.error(loginGetDto.getResult());
        }
        //判断email

        return egoResults;
    }

    //不存在email

    @GetMapping(value="/findByEmail/{email}")
    public UserEntity findByEmail(@PathVariable("email") String email){
        return userRepository.findByEmail(email);
    }
}


