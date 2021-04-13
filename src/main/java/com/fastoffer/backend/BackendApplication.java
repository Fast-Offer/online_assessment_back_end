package com.fastoffer.backend;

import com.fastoffer.backend.entities.CollectionEntity;
import com.fastoffer.backend.repositories.CollectionRepository;
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

//    @Bean
//    CommandLineRunner commandLineRunner(CollectionRepository collectionRepository) {
//        return args -> {
//            CollectionEntity collectionEntity = new CollectionEntity(
//                    UUID.randomUUID(),
//                    UUID.randomUUID(),
//                    "http://dummyimage.com/187x100.png/ff4444/ffffff",
//                    "Chatterbridge",
//                    "Other specified injury of brachial artery, left side, sequela",
//                    "23:18",
//                    true,
//                    "Khaki",
//                    "Mitsubishi",
//                    "{0bac1b74-ee2f-4dfe-812c-bffcaab0190c,'0bac1b74-ee2f-4dfe-812c-bffcaab0190c','0bac1b74-ee2f-4dfe-812c-bffcaab0190c'}"
//            );
//            collectionRepository.save(collectionEntity);
//        };
//    }

}
