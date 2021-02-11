package com.kodilla.good.patterns.food2door;

public class DatabaseRepository implements RepositoryService{
    @Override
    public boolean CreateOrder(Product product, int amount, String provider) {
        System.out.println("Udało się zrealizować zamówienie!");
        return true;
    }
}
