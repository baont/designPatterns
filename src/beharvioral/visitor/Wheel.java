package beharvioral.visitor;

public class Wheel implements CarElement {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
}
