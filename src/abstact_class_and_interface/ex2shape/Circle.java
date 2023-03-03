package abstact_class_and_interface.ex2shape;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }
    @Override
    public void erase(){
        System.out.println("Erase circle");
    }

}
