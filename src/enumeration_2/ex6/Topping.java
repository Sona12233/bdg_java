package enumeration_2.ex6;

import java.util.Scanner;

public enum Topping {
    ONE(2.5),
    TWO(2.8),
    THREE(3.5),
    FOUR(3.9);

    protected double price;

    Topping(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
