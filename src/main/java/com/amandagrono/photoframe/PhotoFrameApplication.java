package com.amandagrono.photoframe;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class PhotoFrameApplication {


    @Autowired
    Environment env;

    @Value("${application.configuration.location}")
    String configLocation;

    @Value("${application.configuration.name}")
    String configName;

    public static void main(String[] args) {
        SpringApplication.run(PhotoFrameApplication.class, args);
    }


}
