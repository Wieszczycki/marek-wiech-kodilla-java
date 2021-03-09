package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUN_SESAME)
                .burgers(3)
                .sauce(Bigmac.SAUCE_1000ISLANDS)
                .ingredients(Ingredient.ONION)
                .ingredients(Ingredient.CHILLI)
                .ingredients(Ingredient.PICKLE)
                .ingredients(Ingredient.MUSHROOMS)
                .build();
        System.out.println(bigmac);

        //When
        String whichBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(Bigmac.BUN_SESAME, whichBun);
        assertEquals(3, howManyBurgers);
        assertEquals(4, howManyIngredients);
    }

    @Test
    void testBigmacWithoutIngredients() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUN_NOSESAME)
                .burgers(2)
                .sauce(Bigmac.SAUCE_BARBECUE)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(0, howManyIngredients);
    }
}
