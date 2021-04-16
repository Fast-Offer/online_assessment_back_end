package com.fastoffer.backend;

import com.fastoffer.backend.entities.CollectionEntity;
import com.fastoffer.backend.entities.IntervieweeAccountEntity;
import com.fastoffer.backend.repositories.CollectionRepository;
import com.fastoffer.backend.repositories.IntervieweeAccountRepository;
import com.fastoffer.backend.repositories.IntervieweeProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(IntervieweeAccountRepository intervieweeAccountRepository, IntervieweeProfileRepository intervieweeProfileRepository) {
        return args -> {
//            intervieweeAccountRepository.findById(UUID.fromString("1b374a97-c04d-43d0-9532-939bcabbdbc5"))
//                    .ifPresent(System.out::println);
            intervieweeProfileRepository.findById(UUID.fromString("966b5ba1-5ae4-4461-a581-1d2a116ee2b4"))
                    .ifPresent(ip -> {
                        IntervieweeAccountEntity intervieweeAccountEntity = ip.getIntervieweeAccountEntity();
                        System.out.println("Fetch Lazy...");
                        System.out.println(intervieweeAccountEntity);
                    });
        };
    }

}
