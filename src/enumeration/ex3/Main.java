package enumeration.ex3;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = Shapes.SQUARE;
        shapes.setSides(3);
        System.out.println(shapes.area());

        Shapes triangle = Shapes.TRIANGLE;
        triangle.setSides(2, 3, 4);
        System.out.println(triangle.area());
    }
}
