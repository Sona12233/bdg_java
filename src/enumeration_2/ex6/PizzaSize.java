package enumeration_2.ex6;

import java.util.Scanner;

public enum PizzaSize {
    SMALL(3),
    MEDIUM(6),
    LARGE(9);

    private int price;

    PizzaSize(int price) {
        this.price = price;
    }

    public int sizePrice(){
        System.out.println("Choose the size");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int priceSize = 0;
        if (input.equals(SMALL.toString())) priceSize = SMALL.price;
        if (input.equals(MEDIUM.toString())) priceSize = MEDIUM.price;
        if (input.equals(LARGE.toString())) priceSize = LARGE.price;
        return 0;
    }
}
