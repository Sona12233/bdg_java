package enumeration_2.ex6;

import java.util.Scanner;

public enum PizzaSize {
    SMALL(3),
    MEDIUM(6),
    LARGE(9);

    private double price;

    PizzaSize(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
