<<<<<<< HEAD
//package com.fastoffer.backend.repositories;
//
//import com.fastoffer.backend.BackendApplication;
//import com.fastoffer.backend.entities.UserEntity;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes= BackendApplication.class)
//public class userGetDTORepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//    @Test
//    public void shouldAdduserIntoDBSuccessfullyGivenPropertyuserObject(){
//        UserEntity userEntity = new UserEntity();
//        userEntity.setEmail("1234@gmail.com");
//        userEntity.setPassword("123445");
//        UserEntity returneduser = userRepository.save(userEntity);
//        Assertions.assertEquals("1234@gmail.com",returneduser.getEmail());
//    }
//}
=======
package com.fastoffer.backend.repositories;

import com.fastoffer.backend.BackendApplication;
import com.fastoffer.backend.entities.IntervieweeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= BackendApplication.class)
public class IntervieweeGetDTORepositoryTest {

    @Autowired
    private IntervieweeRepository intervieweeRepository;
    @Test
    public void shouldAddIntervieweeIntoDBSuccessfullyGivenPropertyIntervieweeObject(){
        IntervieweeEntity intervieweeEntity = new IntervieweeEntity();
        intervieweeEntity.setEmail("1234@gmail.com");
        intervieweeEntity.setPassword("123445");
        IntervieweeEntity returnedInterviewee = intervieweeRepository.save(intervieweeEntity);
        Assertions.assertEquals("1234@gmail.com",returnedInterviewee.getEmail());
    }
}
>>>>>>> origin/dev

