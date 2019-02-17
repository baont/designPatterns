package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphics implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void addGraphic(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        graphics.forEach(graphic -> graphic.draw());
    }
}
