package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.Product;

import java.util.Map;

public class ProviderServiceGlutenFreeShop implements ProviderService {
    String PROVIDER_NAME = "GlutenFreeShop";

    @Override
    public String getName() {
        return PROVIDER_NAME;
    }

    @Override
    public boolean process(Product product, int amount) {
        System.out.println("Dostawca " + PROVIDER_NAME + " nie pracuje w poniedziałki i czwartki.");
        return true;
    }
}
