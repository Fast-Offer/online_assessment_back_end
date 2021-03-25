package com.fastoffer.backend;

import com.sun.xml.bind.unmarshaller.Messages;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Supplier;

@SpringBootTest
//@RunWith(SpringRunner.class)
class BackendApplicationTests {

    Logger logger = LoggerFactory.getLogger(BackendApplicationTests.class);

    @Test
    void contextLoads() {
//        logger.trace(Messages("this is trace"));
        Supplier<String> StrSupplier
                = () -> new String("Logger logs");
        logger.info(StrSupplier);

    }

}
