package beharvioral.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Care taker set state to " + state);
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("current state is " + state);
    }

    public static class Memento {
        private final String sate;

        public Memento(String sate) {
            this.sate = sate;
        }

        public String getSavedState() {
            return this.sate;
        }
    }
}
