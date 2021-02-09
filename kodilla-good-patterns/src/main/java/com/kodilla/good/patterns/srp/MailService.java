package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class MailService implements InformationService{
    @Override
    public void inform(User user, Product product, int amount, LocalDateTime orderDate) {
        System.out.println("[EMAIL] Użytkowniku " + user.getFullName() + ", w dniu " + orderDate.toString() + " dokonałeś zakupu " +
                amount + " sztuk towaru: " + product.getName() + " za cenę: " + product.getPrice() + " PLN.");
    }
}
