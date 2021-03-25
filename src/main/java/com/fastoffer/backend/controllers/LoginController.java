package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.ResponseResults;
import com.fastoffer.backend.dtos.login.LoginPostDto;
import com.fastoffer.backend.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private LoginService LoginService;

    @PostMapping("/login")
    public ResponseResults login(LoginPostDto loginPostDto, HttpSession session) {

        ResponseResults results = LoginService.doLogin(loginPostDto);
        if (results.getStatus() == 200) {
            session.setAttribute("loginUser", results.getData());
        }
        results.setData(null);
        return results;

    }

}
