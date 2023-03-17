package org.example.enumeration_2.ex5;

import java.util.Scanner;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    public void tempRange() {
        System.out.println("Please enter temperature in range -10 to 40");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= -10 && temp <= 5) System.out.println("Probably it is " + WINTER.toString() + " outside");
        if (temp >= 6 && temp <= 20) System.out.println("Probably it is " +
                SPRING.toString() + " or " + FALL.toString() + " outside");
        if (temp >= 21 && temp <= 40) System.out.println("Probably it is " + SUMMER.toString() + " outside");

    }
}
