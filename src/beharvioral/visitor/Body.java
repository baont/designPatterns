package beharvioral.visitor;

public class Body implements CarElement{
    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
