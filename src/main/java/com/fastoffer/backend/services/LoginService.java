package com.fastoffer.backend.services;

import com.fastoffer.backend.dtos.ResponseResults;
import com.fastoffer.backend.dtos.login.LoginGetDto;
import com.fastoffer.backend.dtos.login.LoginPostDto;
import com.fastoffer.backend.entities.UserEntity;
import com.fastoffer.backend.repositories.UserRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LoginService {
    @Autowired
    private UserRepository userRepository;

    public ResponseResults doLogin(LoginPostDto loginPostDto) {
        UserEntity userCheck = userRepository.findByEmail(loginPostDto.getEmail());
        if (userCheck == null) {
            return ResponseResults.error("username or password invalid, please enter again");
        }
        String password = loginPostDto.getPassword();
        String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
        loginPostDto.setPassword(md5DigestAsHex);
        if (userCheck.getEmail().equals(loginPostDto.getEmail()) && userCheck.getPassword().equals(loginPostDto.getPassword())) {
            return ResponseResults.ok(userCheck);
        }
        return ResponseResults.error("login failed, please try again");
    }
}


