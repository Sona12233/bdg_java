package org.example.abstact_class_and_interface.ex8;

public abstract class AnAbstract {

    public AnAbstract(){
        System.out.println("This is a constructor of an abstract class");
    }

    abstract void a_method();

    void nonAbstract(){
        System.out.println("Normal method" +
                " of an abstract class");
    }

}
