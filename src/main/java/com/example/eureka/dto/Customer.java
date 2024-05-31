package com.example.eureka.dto;

import java.util.Arrays;
import java.util.List;

public record Customer(String id, String firstName, String lastName, List<Address> address) {

    private static List<Customer> customers = Arrays.asList(
            new Customer("customer-1", "Manohar", "Reddy", Address.getAddresses()),
            new Customer("customer-2", "Charan", "Reddy", Address.getAddresses()),
            new Customer("customer-3", "Ranjith", "Reddy", Address.getAddresses())
    );

    public static Customer getById(String id) {
        return customers.stream()
                .filter(customer -> customer.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}