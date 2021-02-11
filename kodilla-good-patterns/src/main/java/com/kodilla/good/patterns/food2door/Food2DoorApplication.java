package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.provider.ProviderServiceExtraFoodShop;
import com.kodilla.good.patterns.food2door.provider.ProviderServiceGlutenFreeShop;
import com.kodilla.good.patterns.food2door.provider.ProviderServiceHealthyShop;

public class Food2DoorApplication {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Jogurt destylowany");
        Product product2 = new Product(2, "Mięta w płynie");
        Product product3 = new Product(3, "Sterydy sojowe");
        Product product4 = new Product(4, "Buraczany zamiennik glutenu");

        OrderRequest orderRequest1 = new OrderRequest(product1, 2);
        OrderRequest orderRequest2 = new OrderRequest(product2, 5);
        OrderRequest orderRequest3 = new OrderRequest(product3, 3);
        OrderRequest orderRequest4 = new OrderRequest(product4, 1);

        Food2DoorProcessor processor1 = new Food2DoorProcessor(new MailService(), new ProviderServiceExtraFoodShop(), new DatabaseRepository());
        Food2DoorProcessor processor2 = new Food2DoorProcessor(new MailService(), new ProviderServiceGlutenFreeShop(), new DatabaseRepository());
        Food2DoorProcessor processor3 = new Food2DoorProcessor(new VoiceService(), new ProviderServiceHealthyShop(), new DatabaseRepository());

        OrderDto orderResponse1 = processor1.orderProcess(orderRequest1);
        OrderDto orderResponse2 = processor1.orderProcess(orderRequest2);
        OrderDto orderResponse3 = processor2.orderProcess(orderRequest3);
        OrderDto orderResponse4 = processor3.orderProcess(orderRequest4);
    }
}
