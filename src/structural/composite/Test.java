package structural.composite;

public class Test {
    public static void main(String[] args) {
        Graphic rect = new Rectangle();
        rect.draw();
        Graphic circle = new Circle();
        circle.draw();
        CompositeGraphics com = new CompositeGraphics();
        com.addGraphic(new Rectangle());
        com.addGraphic(new Circle());
        com.draw();
    }
}
