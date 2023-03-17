package org.example.enumeration_2.ex6;

public class Pizza {
    private PizzaSize pizzaSize;
    private Topping topping;

    public Pizza(PizzaSize pizzaSize, Topping topping) {
        this.pizzaSize = pizzaSize;
        this.topping = topping;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public Topping getTopping() {
        return topping;
    }
}
