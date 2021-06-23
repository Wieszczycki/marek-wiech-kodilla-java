package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseFetaDecorator extends AbstractPizzaOrderDecorator {
    public CheeseFetaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getName() {
        return super.getName() + " + additional feta cheese";
    }
}
