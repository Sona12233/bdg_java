package org.example.abstact_class_and_interface.ex5;

public class Test {

    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.enable();
        obj2.enable();
        obj1.disable();
        System.out.println("-----");
        obj1.enable();
        obj2.enable();
    }

}
