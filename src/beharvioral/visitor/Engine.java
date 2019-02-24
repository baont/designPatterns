package beharvioral.visitor;

public class Engine implements CarElement {
    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
