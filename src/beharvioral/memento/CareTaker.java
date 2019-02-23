package beharvioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();
        Originator o = new Originator();
        o.setState("State1");
        o.setState("State2");
        o.setState("State3");
        o.setState("State4");
        savedStates.add(o.saveToMemento());
        o.setState("State5");
        o.restoreFromMemento(savedStates.get(0));
    }
}
