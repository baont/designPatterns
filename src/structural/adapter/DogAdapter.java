package structural.adapter;

public class DogAdapter implements Lion {

    private WildDog dog;

    public DogAdapter(WildDog dog) {
        this.dog = dog;
    }

    @Override
    public void roar() {
        dog.bark();
    }
}
