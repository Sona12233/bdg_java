package algorithmic_exercises;

import java.util.Scanner;

public class AlgorithmicExercises2 {
    /**
     * 1. Write a program that prompts the user to input a positive integer. It should then
     * print the multiplication table of that number.
     */
    public void method1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    /**
     * 2. Two numbers are entered through the keyboard. Write a program to find the
     * value of one number raised to the power of another. (Do not use Java built-in
     * method)
     *
     * @param a
     * @param b
     * @return result a powered b
     */
    public int method2(int a, int b) {
        int result = 1;
        while (b > 0) {
            result = result * a;
            b--;
        }
        return result;
    }

    /**
     * 3. Write a program that prompts the user to input an integer and then outputs the
     * number with the digits reversed. For example, if the input is 12345, the output
     * should be 54321.
     *
     * @param num
     * @return
     */
    public int method3(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);
        return reverse;
    }

    /**
     * 4. Write a program that prompts the user to input a positive integer.
     * It should then output a message indicating whether the number is a prime number.
     * @param num
     * @return
     */
    public boolean method4(int num) {
        int i = 2;
        while (i < num / 2) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /**
     * 6. Write a program to enter the numbers till the user wants and at the end
     * it should display the count of positive, negative and zeros entered. 
     */

    public void method6() {
        int number = 0;
        int zeros = 0;
        int positive = 0;
        int negative = 0;
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number == 0) {
                zeros++;
            }
            if (number > 0) {
                positive++;
            }
            if (number < 0) {
                negative++;
            }
            System.out.println("If you want to enter another number , press 'a'," +
                    " anotherwise press any other key");
            choice = sc.next().charAt(0);
        }
        while (choice == 'a');
        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of zeros: " + zeros);
    }

    /** 7. Write a program to enter the numbers till the user wants and
     *  at the end the program should display the largest and smallest numbers entered.
     */
    public void theLargestAndSmallest() {
        Scanner sc = new Scanner(System.in);
        int number;
        int theLargest = Integer.MIN_VALUE;
        int theSmallest = Integer.MAX_VALUE;
        char choice;
        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number > theLargest) {
                theLargest = number;
            }
            if (number<theSmallest){
                theSmallest=number;
            }
            System.out.println("If you want to enter another number , press 'a'," +
                    " anotherwise press any other key");
            choice = sc.next().charAt(0);
        } while (choice == 'a');
        System.out.println("The maxiumum is: " + theLargest);
        System.out.println("The minimum is: " + theSmallest);
    }

    /** 8. Write a program to print out all Armstrong numbers between 1 and 500.
     *  If sum of cubes of each digit of the number is equal to the number itself,
     *  then the number is called an Armstrong number.
     For example, 153 = ( 1 * 1 * 1 ) +
     ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
     */
    public void armstrongNumbers() {
        int number;
        int digit;
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            number = i;
            while (number > 0) {
                digit = number % 10;
                sum = sum + (digit * digit * digit);
                number /= 10;
            }
            if (sum == i) {
                System.out.println(i + ", ");
            }
            sum = 0;
        }
    }

    /**Write a program to calculate the sum of following series
     *  where n is input by user.
     1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

     */
    public void sum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        AlgorithmicExercises2 obj = new AlgorithmicExercises2();
        // System.out.println(obj.method2(4, 3));
        // System.out.println(1%10);
        // obj.method3(123);
        //System.out.println(obj.method4(451));
        //obj.method6();
        //obj.theLargestAndSmallest();
        //obj.armstrongNumbers();
        //obj.sum();



    }
}
