package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderServiceHardware implements ProductOrderService {

    @Override
    public boolean order(User user, Product product, int amount, LocalDateTime orderDate) {
        System.out.println("Kupiono jakiś sprzęt.");
        return true;
    }
}
