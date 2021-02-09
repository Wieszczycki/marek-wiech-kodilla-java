package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public interface ProductOrderService {

    boolean order(final User user, final Product product, final int amount, final LocalDateTime orderDate);
}
