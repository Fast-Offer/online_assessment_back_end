<<<<<<< HEAD
//package com.fastoffer.backend.sevices;
//
//import com.fastoffer.backend.BackendApplication;
//import com.fastoffer.backend.dtos.SignupGetDto;
//import com.fastoffer.backend.dtos.SignupPostDto;
//import com.fastoffer.backend.entities.UserEntity;
//import com.fastoffer.backend.repositories.UserRepository;
//import com.fastoffer.backend.services.SignupService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes= BackendApplication.class)
//
//@ExtendWith(MockitoExtension.class)
//
//@RunWith(SpringRunner.class)
//
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//public class SignupServiceTest {
//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    SignupService signupService;
//
//    @Test
//    public void shouldAdduserSuccessfullyGivenProperuser() {
//        SignupPostDto signupPostDto = new SignupPostDto();
//        signupPostDto.setEmail("123@gmail.com");
//        signupPostDto.setPassword("321");
//
//        UserEntity mockReturnedInterview = new UserEntity();
//        mockReturnedInterview.setPassword("321");
//        mockReturnedInterview.setEmail("123@gmail.com");
//        UUID ID = UUID.randomUUID();
//        mockReturnedInterview.setId(ID);
//        when(userRepository.save(any())).thenReturn(mockReturnedInterview);
//        SignupGetDto signupGetDto = signupService.createUser(signupPostDto);
//        assertEquals(signupGetDto.getEmail(),"123@gmail.com");
//        assertEquals(signupGetDto.getId(),ID.toString());
//
//    }
//    @Test
//    public void shouldReturnAlreadyExistEmailWhenInputSameEmail() {
//
//        SignupPostDto signupPostDto1 = new SignupPostDto();
//        signupPostDto1.setEmail("123@gmail.com");
//        signupPostDto1.setPassword("321");
//
//
//
//        UserEntity mockInterview = new UserEntity();
//        mockInterview.setPassword("321");
//        mockInterview.setEmail("123@gmail.com");
//        UUID ID = UUID.randomUUID();
//        mockInterview.setId(ID);
//       // when(userRepository.save(any())).thenReturn(mockInterview);
//        UserEntity returneduser = userRepository.save(mockInterview);
//        SignupGetDto signupGetDto1 = signupService.createuser(signupPostDto1);
//
//        SignupPostDto signupPostDto2 = new SignupPostDto();
//        signupPostDto2.setEmail("123@gmail.com");
//        signupPostDto2.setPassword("321");
//        SignupGetDto signupGetDto2 = signupService.createuser(signupPostDto2);
//        assertEquals(signupGetDto2.getResult(),"already exist email");
//
//    }
//}
=======
package com.fastoffer.backend.sevices;

import com.fastoffer.backend.BackendApplication;
import com.fastoffer.backend.dtos.SignupGetDto;
import com.fastoffer.backend.dtos.SignupPostDto;
import com.fastoffer.backend.entities.IntervieweeEntity;
import com.fastoffer.backend.repositories.IntervieweeRepository;
import com.fastoffer.backend.services.SignupService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= BackendApplication.class)

@ExtendWith(MockitoExtension.class)

@RunWith(SpringRunner.class)

@AutoConfigureMockMvc
@ActiveProfiles("test")
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
    @Test
    public void shouldReturnAlreadyExistEmailWhenInputSameEmail() {

        SignupPostDto signupPostDto1 = new SignupPostDto();
        signupPostDto1.setEmail("123@gmail.com");
        signupPostDto1.setPassword("321");



        IntervieweeEntity mockInterview = new IntervieweeEntity();
        mockInterview.setPassword("321");
        mockInterview.setEmail("123@gmail.com");
        UUID ID = UUID.randomUUID();
        mockInterview.setId(ID);
       // when(intervieweeRepository.save(any())).thenReturn(mockInterview);
        IntervieweeEntity returnedInterviewee = intervieweeRepository.save(mockInterview);
        SignupGetDto signupGetDto1 = signupService.createInterviewee(signupPostDto1);

        SignupPostDto signupPostDto2 = new SignupPostDto();
        signupPostDto2.setEmail("123@gmail.com");
        signupPostDto2.setPassword("321");
        SignupGetDto signupGetDto2 = signupService.createInterviewee(signupPostDto2);
        assertEquals(signupGetDto2.getResult(),"already exist email");

    }
}
>>>>>>> origin/dev
