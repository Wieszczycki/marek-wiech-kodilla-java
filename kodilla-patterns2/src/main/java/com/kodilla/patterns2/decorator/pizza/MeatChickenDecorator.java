package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatChickenDecorator extends AbstractPizzaOrderDecorator {
    public MeatChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getName() {
        return super.getName() + " + chicken";
    }
}
