package enumeration_2.ex6;

public class Main {
    public static void main(String[] args) {
        Topping topping = Topping.MUSHROOMS;
        PizzaSize size = PizzaSize.LARGE;
        System.out.println("Your total will be: $" + topping.toppingPrice() + size.sizePrice());
    }


}
