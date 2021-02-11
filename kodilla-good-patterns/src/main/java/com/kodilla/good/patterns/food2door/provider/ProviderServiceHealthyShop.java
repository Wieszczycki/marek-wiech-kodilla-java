package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.Product;

import java.util.Map;

public class ProviderServiceHealthyShop implements ProviderService {
    String PROVIDER_NAME = "HealthyShop";

    @Override
    public String getName() {
        return PROVIDER_NAME;
    }

    @Override
    public boolean process(Product product, int amount) {
        System.out.println("Dostawca " + PROVIDER_NAME + " potrzebuje faktury na glinianej tabliczce i płatności gotówką.");
        return true;
    }
}
