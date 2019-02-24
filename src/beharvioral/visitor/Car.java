package beharvioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement {
    private List<CarElement> parts= new ArrayList();

    public Car() {
        parts.add(new Wheel("Front left"));
        parts.add(new Wheel("Front right"));
        parts.add(new Wheel("Back left"));
        parts.add(new Wheel("Back right"));
        parts.add(new Body());
        parts.add(new Engine());
    }

    @Override
    public void accept(CarVisitor visitor) {
        parts.forEach(carElement ->
                carElement.accept(visitor));
        visitor.visit(this);
    }
}
