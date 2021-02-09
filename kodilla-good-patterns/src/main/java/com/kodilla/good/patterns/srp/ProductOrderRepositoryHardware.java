package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderRepositoryHardware implements ProductOrderRepository{
    @Override
    public boolean createOrder(User user, Product product, int amount, LocalDateTime time) {
        System.out.println("Tworzę hardware-order.");
        return true;
    }
}
