package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private static class CoffeeShop {
        private final List<Order> orders = new ArrayList<>();

        public void takeOrder(String flavour, int tableNum) {
            orders.add(Order.of(flavour, tableNum));
        }

        public void server() {
            orders.forEach(Order::serve);
        }
    }

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Frappe", 1);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Frappe", 897);
        shop.takeOrder("Cappuccino", 97);
        shop.takeOrder("Frappe", 3);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Espresso", 96);
        shop.takeOrder("Frappe", 552);
        shop.takeOrder("Cappuccino", 121);
        shop.takeOrder("Espresso", 121);

        shop.server();
        System.out.println("CoffeeFlavor objects in cache: " + CoffeeFlavour.flavourInCache());
    }
}
