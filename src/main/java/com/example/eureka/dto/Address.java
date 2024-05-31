package com.example.eureka.dto;

import java.util.Arrays;
import java.util.List;

public record Address(String addressId, String address1, String address2, String postalCode, String city,
                      String state) {

    private static List<Address> addresses = Arrays.asList(
            new Address("address-1", "stree1", "apt1", "94536", "fremont", "ca"),
            new Address("address-2", "stree2", "apt2", "94536", "fremont", "ca"),
            new Address("address-3", "stree3", "apt3", "94536", "fremont", "ca")
    );

    public static Address getById(String id) {
        return addresses.stream()
                .filter(address -> address.addressId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Address> getAddresses() {
        return addresses;
    }
}
