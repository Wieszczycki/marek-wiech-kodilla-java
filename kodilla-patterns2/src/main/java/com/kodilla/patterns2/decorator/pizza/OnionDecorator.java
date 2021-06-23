package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator {
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getName() {
        return super.getName() + " + onion";
    }
}
