package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.provider.ProviderService;

public interface RepositoryService {
    boolean CreateOrder(Product product, int amount, String provider);
}
