package com.kodilla.good.patterns.food2door;

public class MailService implements InformationService {
    @Override
    public void inform(Product product, int amount) {
        System.out.println("[EMAIL] Dokonano zamówienia " +
                amount + " sztuk towaru: " + product.getProductName());
    }
}
