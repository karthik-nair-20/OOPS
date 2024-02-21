package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Triangle triangle = new Triangle();
        Square square = new Square();

        triangle.area();
    }
}
