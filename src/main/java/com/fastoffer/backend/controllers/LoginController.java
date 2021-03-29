package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.EgoResults;
import com.fastoffer.backend.dtos.LoginPostDto;
import com.fastoffer.backend.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService LoginService;


//    @PostMapping
//    public ResponseEntity<Map<String, Integer>> checkPassword(@RequestBody LoginPostDto loginPostDto){
//        EgoResults egoResults= LoginService.verifyLogin(loginPostDto);
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        map.put(egoResults.getMsg(),egoResults.getStatus());
//        return ResponseEntity.ok(map);
//    }
@PostMapping
public ResponseEntity<EgoResults> checkPassword(@RequestBody LoginPostDto loginPostDto){
    EgoResults egoResults= LoginService.verifyLogin(loginPostDto);
    return ResponseEntity.ok(egoResults);
}

}
