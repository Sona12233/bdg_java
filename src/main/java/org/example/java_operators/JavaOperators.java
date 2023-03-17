package org.example.java_operators;

public class JavaOperators {
    public static void main(String[] args) {
        // 1. arithmetic operators: declare and initialize int a, int b variables and print
        int a = 8;
        int b = 6;
        System.out.println((a+b) + ", " + (a*b) + ", " + (a/b) + ", " + (a-b) + ", " + (a%b));

        // 2. create double c, double d and print
        double c = 6.4;
        double d = 0.03;
        System.out.println((c+d) + ", " + (c*d) + ", " + (c/d) + ", " + (c-d) + ", " + (c%d));

        // 3. print these expressions
        int x = 2 * ( ( 5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x + ", " + y);

        // 4. unary operators: create 3 variables and print
        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(-e + 82);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int x1 = 3;
        int y1 = ++x1 * 5 / x1-- + --x1;
        System.out.println("x1 is: " + x1);
        System.out.println("y1 is: " + y1);

        // 5. assignment operator: print these expressions
        int x2 = (int) 1.0;
        System.out.println(x2);
        short y2 = (short) 1921222;
        System.out.println(y2);
        System.out.println(2147483647+1);
        long y3 = (x2=3);
        System.out.println(y3);
        boolean y4 = false;
        boolean x3 = (y4 = true);
        System.out.println(x3 + ", " + y4);

        // 6. relational operators: create 2 variables and print these expressions
        int aa = 10;
        int bb = 20;
        System.out.println(aa<bb);
        System.out.println(aa<=bb);
        System.out.println(aa>=bb);
        System.out.println(aa>bb);

        // 7. additional tasks:
        float y5 = 2.1f; //added f in the end

        byte x4 = 5;
        byte y6 = 10;
        int z = x4+y6; //variable z must be int

        short x5 = 10;
        short y7 = 3;
        int z1 = x5*y7; //variable z1 must be int

        long x6 = 10;
        int y8 = 5;
        y8 *= x6; //expression must be *= instead of y8 = y8 * x6

        // 8. declare 2 int variables initialize them, then replace them
        int xx = 10;
        int yy = 5;
        int newvar = xx;
        xx = yy;
        yy = newvar;
        System.out.println(xx + ", " + newvar + ", " + yy);

        // 9. try to solve the same exercise without third variable
        xx = xx + yy;
        yy = xx - yy;
        xx = xx - yy;

        // 10. sum up 1-100 numbers
        int a1 = 1;
        int a100 = 100;
        int sum = (a1 + a100) * a100 / 2;
        System.out.println(sum);

        // 1. bitwise & logical operators: create  2 variables and print
        int a2 = 8;
        int b2 = 3;
        System.out.println(a2&b2); // 1000 & 0011;
        System.out.println(a2^b2); // if 00 or 11 -> 0, if 01 or 10 -> 1
        System.out.println(a2|b2); // if there is at least one 1 -> 1
        System.out.println(~a2); // if 0 -> 1, if 1 -> 0;
        System.out.println(true || (a2<4)); // if the first condition is true then the expression is true, it will not check the second
        System.out.println((b2>=6) || (++a2 <= 7));
        System.out.println((a2<b2)?a2:b2);
        System.out.println(b2^b2);

        // 1. shift operator
        System.out.println(10<<2);
        System.out.println(-10<<3);
        System.out.println(20>>2);

        // 2. multiply the variable by 8 and 16 without *
        System.out.println(10<<3); // multiplying 10 by 8
        System.out.println(6<<4); // multiplying 10 by 16
    }
}
