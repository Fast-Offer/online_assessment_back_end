package com.fastoffer.backend.repositories;

import com.fastoffer.backend.BackendApplication;
import com.fastoffer.backend.entities.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes= BackendApplication.class)
public class userGetDTORepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void shouldAdduserIntoDBSuccessfullyGivenPropertyuserObject(){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail("1234@gmail.com");
        userEntity.setPassword("123445");
        UserEntity returneduser = userRepository.save(userEntity);
        Assertions.assertEquals("1234@gmail.com",returneduser.getEmail());
    }
}

