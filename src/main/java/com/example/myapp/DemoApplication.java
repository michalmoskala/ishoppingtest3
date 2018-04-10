package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/api")
    public String greeting(){
        return "test";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

