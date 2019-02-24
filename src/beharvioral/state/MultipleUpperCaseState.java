package beharvioral.state;

public class MultipleUpperCaseState implements StateLike {
    private int count = 0;
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        if (++count > 1) {
            context.setState(new LowerCaseState());
        }
    }
}
