package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseMozarellaDecorator extends AbstractPizzaOrderDecorator {
    public CheeseMozarellaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getName() {
        return super.getName() + " + additional mozarella";
    }
}
