package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExamples {
    /**
     * 1.	Write a program that reads an integer from the
     * user and prints its reciprocal.
     * If the user enters 0, the program should throw an
     * exception and print an error message.
     *
     * @throws ArithmeticException
     */
    public void makeReciprocal() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) throw new ArithmeticException("Cannot divide by zero");
        else System.out.println(1 / a);
    }

    /**
     * 2. Input array of integers and calculate the sum.
     * Throw an exception if the user enters non-integer value
     *
     * @throws Exception
     */
    public void sumOfArray() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int size = sc.nextInt();
        int sum = 0;
        System.out.println("Enter integers of the array: ");
        for (int i = 0; i < size; i++) {
            try {
                sum += sc.nextInt();
            } catch (Exception e) {
                throw new Exception("Enter only integers");
            }
        }
        System.out.println("Sum: " + sum);
    }

    /**
     * 3. Enter 2 numbers and divide them.
     * If the second number is equals to 2 throw an exception.
     *
     * @throws Exception
     */
    public void twoNumbers() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println(num1 / num2);
        if (num2 == 0) {
            throw new Exception("You cannot enter second" +
                    " number as 0 because it is the denominator ");
        }
    }

    /**
     * 4. Write a program that reads a file name from the user and
     * prints its contents to the console. If the file does
     * not exist or cannot be opened, the program should
     * throw an exception and print an error message.
     *
     * @throws FileNotFoundException
     */
    public void fileName() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        try (Scanner input = new Scanner(new File(fileName))) {
            while (input.hasNextLine())
                System.out.println(input.hasNextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
    }

    /**
     * 5.	Write a program that reads an integer number
     * and  calculates and prints its square root. If the
     * number is  invalid or negative, print "Invalid number".
     * In all  cases finally print "Good bye". Use try-catch-finally.
     *
     * @throws Exception
     */
    public void squareRoot() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer:");
        try {
            int num = sc.nextInt();
            if (num < 0) System.out.println("Error: Invalid number");
            else System.out.println(Math.sqrt(num));
        } catch (Exception e) {
            System.out.println("Error: Invalid number");
        } finally {
            System.out.println("Good bye");
        }
    }

    /**
     * 7. Write a program that prompts the user to enter
     * their age. If the user enters an age that is negative
     * or greater than 120, the program should throw
     * an exception and print an error message.
     * @throws Exception
     */
    public void age() throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 120 || age < 0) throw new Exception("Age must" +
                "be between 0 and 120 ");
    }

    public void quotient() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        if (b == 0) throw new Exception("Second number can't be 0");
        else System.out.println("Quotient: " + a/b);
    }

}

