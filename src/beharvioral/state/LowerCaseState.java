package beharvioral.state;

public class LowerCaseState implements StateLike {
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name);
        context.setState(new MultipleUpperCaseState());
    }
}
