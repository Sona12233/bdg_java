package enumeration_2.ex6;

import java.util.Scanner;

public class Main {

    public static PizzaSize getSize() {
        String str;
        Scanner scStr = new Scanner(System.in);
        System.out.println("Select the size");
        str = scStr.nextLine();
        switch (str) {
            case "small":
                return PizzaSize.SMALL;
            case "medium":
                return PizzaSize.MEDIUM;
            case "LARGE":
                return PizzaSize.LARGE;
            default:
                System.out.println("Wrong input");
        }
        return getSize();
    }

    public static Topping getTopping() {
        int topping;
        Scanner scNum = new Scanner(System.in);
        System.out.println("Enter topping's count");
        topping = scNum.nextInt();
        switch (topping) {
            case 1:
                return Topping.ONE;
            case 2:
                return Topping.TWO;
            case 3:
                return Topping.THREE;
            case 4:
                return Topping.FOUR;
            default:
                System.out.println("Wrong input");
        }
        return getTopping();
    }

    public static void main(String[] args) {
        PizzaSize size = getSize();
        Topping topping = getTopping();
        Pizza pizza = new Pizza(size, topping);
        Cost cost = new Cost(pizza);
        System.out.println("Your pizza will cost $" + cost.getCost() + ".");
    }

}
