package creation.abstractFactory.factory;

import creation.abstractFactory.Button;
import creation.abstractFactory.Window;
import creation.abstractFactory.WindowButton;
import creation.abstractFactory.WindowWindow;

public class WindowFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Window createWindow() {
        return new WindowWindow();
    }
}
