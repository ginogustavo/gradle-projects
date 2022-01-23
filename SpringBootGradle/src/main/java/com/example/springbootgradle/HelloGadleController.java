package com.example.springbootgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGadleController {

    @GetMapping("/hello")
    public String hello(){
        return "Spring Boot with Gradle";
    }

}
