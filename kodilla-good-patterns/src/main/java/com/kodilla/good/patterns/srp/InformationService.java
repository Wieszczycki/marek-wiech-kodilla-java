package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public interface InformationService {
    void inform(User user, Product product, int amount, LocalDateTime orderDate);
}
