package structural.proxy;

import java.util.ServiceConfigurationError;

public class Test {
    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new SimpleDoor());

        securedDoor.authenticate("aseg");
        securedDoor.open();

        securedDoor.authenticate("abc");
        securedDoor.open();
    }
}

