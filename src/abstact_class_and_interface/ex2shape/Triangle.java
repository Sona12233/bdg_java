package abstact_class_and_interface.ex2shape;

public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("Draw triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase triangle");
    }
}
