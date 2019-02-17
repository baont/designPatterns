package structural.bridge;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Shape(new DrawCicle());
        circle.draw();

        Shape rect = new Shape(new DrawRect());
        rect.draw();
    }
}
