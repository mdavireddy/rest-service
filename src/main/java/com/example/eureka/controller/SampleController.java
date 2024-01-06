package com.example.eureka.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String portNumber;

    @GetMapping("/message")
    public String message() {
        return String.format("Response from '%s with Port Number %s'!", appName, portNumber);
    }
}
