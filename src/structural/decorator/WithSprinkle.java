package structural.decorator;

public class WithSprinkle extends CoffeeDecorator {
    public WithSprinkle(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkle";
    }
}
