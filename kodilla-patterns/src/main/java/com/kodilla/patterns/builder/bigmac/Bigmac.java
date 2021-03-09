package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    public static final String BUN_SESAME = "bułka z sezamem";
    public static final String BUN_NOSESAME = "bułka bez sezamu";

    public static final String SAUCE_STANDARD = "standard";
    public static final String SAUCE_1000ISLANDS = "1000 wysp";
    public static final String SAUCE_BARBECUE = "barbecue";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<Ingredient> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if ((bun.equals(null)) || (burgers == 0) || (sauce.equals(null))) {
                throw new IllegalStateException("No bun or no burgers or no sauce specified!");
            } else {
                return new Bigmac(bun, burgers, sauce, ingredients);
            }
        }
    }

    private Bigmac(final String bun, int burgers, String sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
