package structural.flyweight;

@FunctionalInterface
public interface Order {
    public void serve();

    static Order of(String flavourName, int tableNum) {
        CoffeeFlavour flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving flavour " + flavourName
                + " to table number " + tableNum);
    }
}
