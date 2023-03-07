package exceptions;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        String name, a;
        int age;
        char myClass;

        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter class");
        myClass = sc.nextLine().charAt(0);
        a = sc.next();

        try {

            System.out.println(age / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
