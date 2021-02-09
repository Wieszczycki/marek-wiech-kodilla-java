package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createOrder(User user, Product product, int amount, LocalDateTime time);
}
