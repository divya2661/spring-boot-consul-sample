package com.example.jepsentest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}