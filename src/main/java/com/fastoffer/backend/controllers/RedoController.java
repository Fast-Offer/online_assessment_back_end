package com.fastoffer.backend.controllers;

import com.fastoffer.backend.dtos.ResponseResults;
import com.fastoffer.backend.dtos.redo.RedoGetDto;
import com.fastoffer.backend.services.RedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@RestController
public class RedoController {
    @Autowired
    private RedoService redoService;
    //    @RequestMapping("/redo")
//    public ResponseResults getRedoQuestions(HttpSession session) {
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null) {
//            UserEntity theUser = (UserEntity) loginUser;
//            List<RedoGetDto> redoList = redoService.getRedoList(theUser.getId());
//            return ResponseResults.ok(redoList);
//        }
//        return ResponseResults.error("cannot get the lists");
//    }
    @RequestMapping("/redo/{uid}")
    public ResponseResults getRedoQuestions(@PathVariable UUID uid) {
        List<RedoGetDto> redoList = redoService.getRedoList(uid);
        if (redoList != null && redoList.size() > 0) {
            return ResponseResults.ok(redoList);
        }
        return ResponseResults.error("cannot get the list");
    }
}
