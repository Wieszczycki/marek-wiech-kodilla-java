package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderRepositoryAnimal implements ProductOrderRepository{
    @Override
    public boolean createOrder(User user, Product product, int amount, LocalDateTime time) {
        System.out.println("Tworzę animal-order.");
        return false;
    }
}
