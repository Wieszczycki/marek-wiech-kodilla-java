package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.Product;

import java.util.Map;

public class ProviderServiceExtraFoodShop implements ProviderService {
    String PROVIDER_NAME = "ExtraFoodShop";

    @Override
    public String getName() {
        return PROVIDER_NAME;
    }

    @Override
    public boolean process(Product product, int amount) {
        System.out.println("Dostawca " + PROVIDER_NAME + " dolicza 5PLN za dostawę każdej sztuki.");
        return amount <= 3;
    }
}
