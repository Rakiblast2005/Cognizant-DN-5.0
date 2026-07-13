package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

    // Logger instance for application messages
    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        // Start the Spring Boot application
        SpringApplication.run(SpringLearnApplication.class, args);

        // Log successful startup
        LOGGER.info("Spring Learn Application started successfully.");
    }
}