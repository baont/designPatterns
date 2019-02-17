package structural.proxy;

public class SimpleDoor implements Door{
    @Override
    public void open() {
        System.out.println("Door open");
    }

    @Override
    public void close() {
        System.out.println("Door close");
    }
}
