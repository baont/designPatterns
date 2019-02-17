package structural.adapter;

public class Hunter {
    public void hunt(Lion lion) {
        lion.roar();
    }

    public static void main(String[] args) {
        AffricanLion lion = new AffricanLion();
        DogAdapter adapter = new DogAdapter(new WildDog());

        Hunter hunter = new Hunter();
        hunter.hunt(lion);
        hunter.hunt(adapter);
    }
}
