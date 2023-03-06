package enumeration_2.ex6;

import java.util.Scanner;

public enum Topping {
    PEPPERONI,
    MUSHROOMS,
    ONIONS,
    SAUSAGE;
    public int toppingPrice(){
        System.out.println("How many toppings do you want");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int price = input;
        return price;
    }
}
