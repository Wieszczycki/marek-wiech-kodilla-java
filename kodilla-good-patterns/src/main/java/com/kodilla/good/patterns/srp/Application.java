package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest orderRequest1 = productOrderRequestRetriever.retrieveHardware();
        ProductOrderRequest orderRequest2 = productOrderRequestRetriever.retrieveAnimal();

        ProductOrderServiceHardware productOrderServiceHardware = new ProductOrderServiceHardware();
        ProductOrderServiceAnimal productOrderServiceAnimal = new ProductOrderServiceAnimal();

        ProductOrderProcessor productOrderProcessor1 = new ProductOrderProcessor(
                new MailService(), new ProductOrderServiceHardware(), new ProductOrderRepositoryHardware());
        ProductOrderProcessor productOrderProcessor2 = new ProductOrderProcessor(
                new MailService(), new ProductOrderServiceAnimal(), new ProductOrderRepositoryAnimal());

        productOrderProcessor1.process(orderRequest1);
        productOrderProcessor2.process(orderRequest2);
    }
}
