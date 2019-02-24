package beharvioral.visitor;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.accept(new CarVisitor() {
            @Override
            public void visit(Car car) {
                System.out.println("visited car");
            }

            @Override
            public void visit(Body body) {
                System.out.println("visited body");
            }

            @Override
            public void visit(Engine engine) {
                System.out.println("visited engine");
            }

            @Override
            public void visit(Wheel wheel) {
                System.out.println("visited wheel" + wheel.getName());
            }
        });
    }
}
