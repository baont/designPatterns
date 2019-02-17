package creation.simpleFactory;

public class DoorFactory {
    public static Door createDoor(int width, int height) {
        Door d = new Door();
        d.setWidth(width);
        d.setHeight(height);
        return d;
    }
}
