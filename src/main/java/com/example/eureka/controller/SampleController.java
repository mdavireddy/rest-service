package com.example.eureka.controller;


import com.example.eureka.dto.Address;
import com.example.eureka.dto.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
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


    @QueryMapping
    public Customer customerById(@Argument String id) {
        return Customer.getById(id);
    }

    @SchemaMapping
    public Address address(Customer customer) {
        return Address.getById(customer.id());
    }
}
