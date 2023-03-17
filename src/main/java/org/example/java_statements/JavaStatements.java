package org.example.java_statements;

public class JavaStatements {
    /** 1.
     * This method checks if x is even or odd
     * @param x
     */
    public void evenOrOdd(int x){
        if(x%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    /** 2.
     * This method checks if x is positive or negative
     * @param x
     */
    public void positiveOrNegative(int x){
        if(x>0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    /** 3.
     * This method checks if x<8 & x>5 or x<20 & x>15
     * @param x
     */
    public void method(int x){
        if((x<8 && x>5) || (x<20 && x>15)){
            System.out.println(true);
        }
    }

    /** 4.
     * This method checks if x%5==0 and x%7==0 are true at the same time
     * @param x
     */
    public void method2(int x){
        if (x%5==0 && x%7==0){
            System.out.println(true);
        }
    }

    /** 5.
     * This method prints false if the middle number of a three digital number is 7
     * @param x
     */
    public void method3(int x){
        if((x%100-x%10)/10==7){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }

    /** 6. is the point inside the circle or not
     * @param x
     */
    public void method4(int x, int y){
        if((Math.sqrt((-x)*(-x)) + ((-y)*(-y)))<=5){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    /** 7. find the maximum number
     * @param x
     * @param y
     * @param z
     */
    public void method5(int x, int y, int z){
        if(x>y && x>z) {
            System.out.println("x: " + x + " is max");
        } else if (y > x && y>z) {
            System.out.println("y: " + y + " is max" );
        } else {
            System.out.println("z: " + z+ " is max");
        }
    }

    /** 8. is the year leap or not
     * @param x
     */
    public void method6(int x){
        if((x%4==0) && (x%100!=0 || x%400==0)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /** 11. print 1-200 numbers
     * @param
     */
    public void method7(){
        for(int x3 = 1; x3<=200; x3++ ){
            System.out.println(x3);
        }
    }

    /** 12. print the first digit of a number
     * @param x4
     */
    public void method8(int x4){
        int first = 0;
        while (x4>0){
            first = x4%10;
            x4 = x4/10;
        }
        System.out.println(first);
    }

    /** 14. draw a square with * symbols
     * @param
     */
    public void method9(int x){
        for (int i = 0; i < x; i++){
            for (int k = 0; k < x; k++){
                System.out.println("x");
            }
            System.out.println("");
        }
    }

    /** 15.
     * @param x
     */
    public int sum(int x){
        int sum = 0;
        for(int i = 5; i <= x; i+=5){
            sum+=1;
        }
        return sum;
    }

    /** 8.
     * @param x
     */
    public void product(int x){
        int pr = 1;
        for(int i=10; i<=x && i<99; i++){
            if(i%2==0){
                pr *= i; }
        }
        System.out.println();
    }

    public void sumOfDigits(int x){
        int sum = 0;
        while(x!=0){
            sum+= x%10;
            x /= 10;
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {
        JavaStatements obj = new JavaStatements();

        // 9. what to add in while loop to print 8
        int x = 0;
        while (x++<10){
            if(x==8){
                break;
            }
        }
        System.out.println(x);

        //10.1
        int x1 = 2;
        int y1 = 5;
        while(x1 < 10){
            x1++; // x1 < 10 is always true, loop will be infinite
            y1++;
        }

        //10.2
        int x2 = 15;
        while (x > 10){
            x2 = --x2; // changed into pre-decrement so the loop is not infinite anymore
        }
        System.out.println(x2);

        //13
        int x3 = 1;
        int y3 = 0;
        while(x3 < 5 && y3 <10){
            System.out.println("x3 + y3 = " + x3 + y3);
        }

    }
}
