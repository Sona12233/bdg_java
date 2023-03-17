package org.example.algorithmic_exercises;

import java.util.Random;

public class AlgorithmicExercises {
    /**
     * 1. Provided that you have a given number of small rice bags (1 kilo each)
     * and big rice bags (5 kilos each), write a method that returns true if it is
     * possible to make a package with goal kilos of rice.
     *
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public boolean method1(int small, int big, int goal) {
        if (big * 5 >= goal) {
            if (small >= goal % 5) {
                return true;
            }
        } else if (small >= goal - big * 5) {
            return true;
        }
        return false;
    }

    /** 2. The prime factors of 455 are 5, 7 and 13.
     Write a method that calculates the largest prime factor of a given
     number.
     * @param n
     * @return
     */
    public int primeFactor(int n) {
        if (n <= 1)
            return 1;
        int i = 2;
        int theLargest = 2;
        while (i <= n) {
            if (n % i == 0) {
                theLargest = i;
                n = n / i;
                i--;
            }
            i++;
        }
        return theLargest;
    }

    /** 3. Write a program that generates a random number between 1 and 100
     (you can use the Random ( ) method from the Math class.
     the next step check whether it is an even or an odd number. Each of
     the above actions should be written to the console.
     * @return
     */
    public boolean random(){
        Random rd = new Random();
        int n = rd.nextInt(101);
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    /** 4. Write a program that will use the while loop to find the largest and
     smallest number from the set of 10 randomly drawn integers from 1 to
     100. In this task, do not use arrays or other collections.
     import java.util.Random;
     */
    public void random2(){
        Random rd = new Random();
        int theLargest = 0;
        int theSmallest = 100;
        int i = 10;
        while(i>0){
            int n = rd.nextInt(101);
            i--;
            System.out.println(n);
            if(n<theSmallest){
                theSmallest=n;
            }
            if (n>theLargest) {
                theLargest=n;
            }
        }
        System.out.println(theLargest + ", " + theSmallest);
    }

    public static void main(String[] args) {
        AlgorithmicExercises obj = new AlgorithmicExercises();
        // System.out.println(obj.primeFactor(64));
        obj.random2();

    }
}
