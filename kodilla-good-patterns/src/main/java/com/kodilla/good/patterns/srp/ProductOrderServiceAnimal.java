package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderServiceAnimal implements ProductOrderService {
    @Override
    public boolean order(User user, Product product, int amount, LocalDateTime orderDate) {
        System.out.println("Kupiono jakieś zwierzątko.");
        return true;
    }
}
