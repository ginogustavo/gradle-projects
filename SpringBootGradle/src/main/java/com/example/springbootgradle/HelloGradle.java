package com.example.springbootgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle{

    @GetMapping("/hello")
    public String hello(){
        return "Sprint boot with Gradle super easy";
    }
}