package creation.abstractFactory.factory;

import creation.abstractFactory.Button;
import creation.abstractFactory.LinuxButton;
import creation.abstractFactory.Window;
import creation.abstractFactory.WindowWindow;

public class LinuxFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new WindowWindow();
    }
}
