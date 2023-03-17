package org.example.abstact_class_and_interface.ex4;

public class Arithmetic implements Test {
     int n = 6;

    @Override
    public void square() {
        System.out.println(n*n);
    }
}
