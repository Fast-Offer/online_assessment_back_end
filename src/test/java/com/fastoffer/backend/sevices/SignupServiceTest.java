package com.fastoffer.backend.sevices;

import com.fastoffer.backend.dtos.SignupGetDto;
import com.fastoffer.backend.dtos.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeEntity;
import com.fastoffer.backend.repositories.IntervieweeRepository;
import com.fastoffer.backend.services.SignupService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class SignupServiceTest {
    @Mock
    private IntervieweeRepository intervieweeRepository;

    @InjectMocks
    SignupService signupService;

    @Test
    public void shouldAddIntervieweeSuccessfullyGivenProperInterviewee() {
        SignupPostDto signupPostDto = new SignupPostDto();
        signupPostDto.setEmail("123@gmail.com");
        signupPostDto.setPassword("321");

        IntervieweeEntity mockReturnedInterview = new IntervieweeEntity();
        mockReturnedInterview.setPassword("321");
        mockReturnedInterview.setEmail("123@gmail.com");
        UUID ID = UUID.randomUUID();
        mockReturnedInterview.setId(ID);
        when(intervieweeRepository.save(any())).thenReturn(mockReturnedInterview);
        SignupGetDto signupGetDto = signupService.createInterviewee(signupPostDto);
        assertEquals(signupGetDto.getEmail(),"123@gmail.com");
        assertEquals(signupGetDto.getId(),ID.toString());

    }
//    @Test
//    public void shouldReturnAlreadyExistEmailWhenInputSameEmail() {
//
//        SignupPostDto signupPostDto1 = new SignupPostDto();
//        signupPostDto1.setEmail("123@gmail.com");
//        signupPostDto1.setPassword("321");
//
//        IntervieweeEntity mockReturnedInterview = new IntervieweeEntity();
//        mockReturnedInterview.setPassword("321");
//        mockReturnedInterview.setEmail("123@gmail.com");
//        UUID ID = UUID.randomUUID();
//        mockReturnedInterview.setId(ID);
//        when(intervieweeRepository.save(any())).thenReturn(mockReturnedInterview);
//        SignupGetDto signupGetDto1 = signupService.createInterviewee(signupPostDto1);
//
//        SignupPostDto signupPostDto2 = new SignupPostDto();
//        signupPostDto2.setEmail("123@gmail.com");
//        signupPostDto2.setPassword("321");
//        SignupGetDto signupGetDto2 = signupService.createInterviewee(signupPostDto2);
//        assertEquals(signupGetDto2.getResult(),"already exist email");
//
//    }
}
