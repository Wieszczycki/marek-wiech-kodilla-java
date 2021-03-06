package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User marysia = new Millenials("Marysia");
        User krzys = new YGeneration("K$zych");
        User jessika = new ZGeneration("L@ttE");

        //When
        String marysiaSharesOn = marysia.sharePost();
        System.out.println("Marysia shares on: " + marysiaSharesOn);
        String krzysSharesOn = krzys.sharePost();
        System.out.println("Krzys shares on: " + krzysSharesOn);
        String jessikaSharesOn = jessika.sharePost();
        System.out.println("Jessika shares on: " + jessikaSharesOn);

        //Then
        assertEquals("Facebook", marysiaSharesOn);
        assertEquals("Twitter", krzysSharesOn);
        assertEquals("Snapchat", jessikaSharesOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User jessika = new ZGeneration("L@ttE");

        //When
        String jessikaSharesOn = jessika.sharePost();
        System.out.println("Jessika shares on: " + jessikaSharesOn);
        jessika.setSocialPublisher(new FacebookPublisher());
        jessikaSharesOn = jessika.sharePost();
        System.out.println("Jessika NOW shares on: " + jessikaSharesOn);

        //Then
        assertEquals("Facebook", jessikaSharesOn);
    }
}
