package com.kodilla.good.patterns.food2door;

public class VoiceService implements InformationService{
    @Override
    public void inform(Product product, int amount) {
        System.out.println("[VOICE] Dzień dobry, chyba na pewno udało się zamówić " +
                amount + " sztuk towaru: " + product.getProductName());    }
}
