package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita", name);
    }

    @Test
    public void testOnionGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(16), calculatedCost);
    }

    @Test
    public void testOnionGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita + onion", name);
    }

    @Test
    public void testMeatChickenGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MeatChickenDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testMeatChickenGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MeatChickenDecorator(order);
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita + chicken", name);
    }

    @Test
    public void testMeatBeefGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MeatBeefDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(21), calculatedCost);
    }

    @Test
    public void testMeatBeefGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new MeatBeefDecorator(order);
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita + beef", name);
    }

    @Test
    public void testOnionPepperCheeseMozarellaMeatChickenGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        order = new PepperDecorator(order);
        order = new CheeseMozarellaDecorator(order);
        order = new MeatChickenDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @Test
    public void testOnionPepperCheeseMozarellaMeatChickenGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new OnionDecorator(order);
        order = new PepperDecorator(order);
        order = new CheeseMozarellaDecorator(order);
        order = new MeatChickenDecorator(order);
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita + onion + pepper + additional mozarella + chicken", name);
    }

    @Test
    public void testPepperCheeseFetaMeatBeefGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PepperDecorator(order);
        order = new CheeseFetaDecorator(order);
        order = new MeatBeefDecorator(order);
        //When
        BigDecimal calculatedCost = order.getCost();
        //Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }

    @Test
    public void testPepperCheeseFetaMeatBeefGetName() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new PepperDecorator(order);
        order = new CheeseFetaDecorator(order);
        order = new MeatBeefDecorator(order);
        //When
        String name = order.getName();
        //Then
        assertEquals("Pizza ordered: Margherita + pepper + additional feta cheese + beef", name);
    }

}
