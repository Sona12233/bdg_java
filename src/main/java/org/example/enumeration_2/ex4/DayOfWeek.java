package org.example.enumeration_2.ex4;

import java.util.Scanner;

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    /**
     * This method prompts the user to enter a day and checks if it is weekend or a weekend
     */
    public void isWeekendOrWeekday() {
        System.out.println("Please enter a day from week");
        Scanner sc = new Scanner(System.in);
        String day = sc.next().toUpperCase();
        for (int i = 0; i <= 6; i++) {
            if (i <= 4 && day.equals(DayOfWeek.values()[i].toString())) // check that day is weekday
                System.out.println(day + " is a weekday");
            if ((i==5 || i==6) && day.equals(DayOfWeek.values()[i].toString())) // check that day is weekend
                System.out.println(day + " is a weekend");
        }
    }
}
