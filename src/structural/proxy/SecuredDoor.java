package structural.proxy;

public class SecuredDoor implements Door {
    private final Door door;
    private final String password = "abc";
    private String enteredPassword;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    public void authenticate(String password) {
        enteredPassword = password;
    }

    @Override
    public void open() {
        if (password.equals(enteredPassword)) {
            door.open();
        } else {
            System.out.println("can not do that");
        }
    }

    @Override
    public void close() {
        door.close();
    }
}
