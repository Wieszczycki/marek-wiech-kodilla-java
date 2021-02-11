package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.Product;

import java.util.Map;

public interface ProviderService {
    String getName();
    boolean process(Product product, int amount);
}
