package com.kodilla.good.patterns.food2door.provider;

import com.kodilla.good.patterns.food2door.client.Client;
import com.kodilla.good.patterns.food2door.product.Product;

import java.util.Map;

public class ProviderExtraFoodShop implements Provider{
    String PROVIDER_NAME = "ExtraFoodShop";

    @Override
    public String getName() {
        return PROVIDER_NAME;
    }

    @Override
    public void process(Client client, Map<Product, Integer> order) {

    }
}
