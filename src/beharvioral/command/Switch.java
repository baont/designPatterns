package beharvioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * The invoker class
 */
public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command command) {
        history.add(command);
        command.execute();
    }
}
