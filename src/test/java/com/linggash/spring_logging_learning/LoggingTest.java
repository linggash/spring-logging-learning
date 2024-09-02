package com.linggash.spring_logging_learning;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-first.properties")
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Belajar Java");
        log.warn("Belajar Spring");
        log.error("Belajar Java Spring Boot");
    }
}
