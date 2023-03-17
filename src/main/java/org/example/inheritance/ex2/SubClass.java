package org.example.inheritance.ex2;

public class SubClass extends SuperClass {
    String message = "Hello SubClass";

    public SubClass(){
        System.out.println(super.message);
        System.out.println(this.message);
    }
}
