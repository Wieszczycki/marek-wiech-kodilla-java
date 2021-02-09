package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieveHardware() {
        User user = new User("szyszka", "Marek Wiech", "adres@domena.pl");

        ProductHardware mouse = new ProductHardware("Logikmech K570", 120.0);

        return new ProductOrderRequest(user, mouse, 2, LocalDateTime.now());
    }

    public ProductOrderRequest retrieveAnimal() {
        User user = new User("szyszka", "Marek Wiech", "adres@domena.pl");

        ProductAnimal hamster = new ProductAnimal("Chomik krzywozębny asyryjski", 65.0);

        return new ProductOrderRequest(user, hamster, 1, LocalDateTime.now());
    }
}
