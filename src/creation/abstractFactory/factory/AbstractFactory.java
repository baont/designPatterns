package creation.abstractFactory.factory;

import creation.abstractFactory.Button;
import creation.abstractFactory.Window;

public interface AbstractFactory {
    Button createButton();
    Window createWindow();
}
