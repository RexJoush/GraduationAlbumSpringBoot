package com.nwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
@EnableCaching
public class GraduationAlbumSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduationAlbumSpringBootApplication.class, args);
    }

}
