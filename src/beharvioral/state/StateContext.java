package beharvioral.state;

public class StateContext {
    private StateLike currentState;

    public StateContext() {
        this.currentState = new LowerCaseState();
    }

    public void setState(StateLike state) {
        this.currentState = state;
    }

    public void printName(String name) {
        currentState.writeName(this, name);
    }
}
