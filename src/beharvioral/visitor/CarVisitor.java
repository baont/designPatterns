package beharvioral.visitor;

public interface CarVisitor {
    public void visit(Car car);
    public void visit(Body body);
    public void visit(Engine engine);
    public void visit(Wheel wheel);
}
