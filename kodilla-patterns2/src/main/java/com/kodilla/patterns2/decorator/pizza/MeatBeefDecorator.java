package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatBeefDecorator extends AbstractPizzaOrderDecorator {
    public MeatBeefDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getName() {
        return super.getName() + " + beef";
    }
}
