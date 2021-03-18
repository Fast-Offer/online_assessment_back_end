//package com.fastoffer.backend.controllers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fastoffer.backend.dtos.SignupGetDto;
//import com.fastoffer.backend.dtos.SignupPostDto;
//import com.fastoffer.backend.services.SignupService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(SignupController.class)
//public class SignupControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private SignupService signupService;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//    @Test
//    public void testCreateuser() throws Exception{
//        SignupPostDto signupPostDto = new SignupPostDto();
//        SignupGetDto signupGetDto = new SignupGetDto();
//        signupGetDto.setEmail("12345@gmail.com");
//        signupGetDto.setId("1234");
//        BDDMockito.given(signupService.createUser(signupPostDto)).willReturn(signupGetDto);
//        mockMvc.perform(post("/user")
//                .content(objectMapper.writeValueAsString(signupPostDto))
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.email").exists())
//                .andExpect(jsonPath("$.email").value("12345@gmail.com"))
//                .andExpect(jsonPath("$.id").exists())
//                .andExpect(jsonPath("$.id").value("1234"));
//    }
//}
