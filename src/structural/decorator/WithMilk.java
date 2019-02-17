package structural.decorator;

public class WithMilk extends CoffeeDecorator {
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}
