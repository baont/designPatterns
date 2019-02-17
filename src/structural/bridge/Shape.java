package structural.bridge;

public class Shape {
    private DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public void draw() {
        drawApi.draw();
    }
}
