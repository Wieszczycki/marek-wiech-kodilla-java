package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.client.Client;
import com.kodilla.good.patterns.food2door.product.Product;

import java.util.Map;

public interface Provider {
    String getName();
    void process(Client client, Map<Product, Integer> order);
}
