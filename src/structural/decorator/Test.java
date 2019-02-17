package structural.decorator;

public class Test {
    public static void main(String[] args) {
        System.out.println(new WithSprinkle(new WithMilk(new SimpleCoffee())).getDescription());
    }
}
